package com.varxyz.javacafe.controller;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.varxyz.javacafe.domain.Cafe;
import com.varxyz.javacafe.service.JavaCafeService;
import com.varxyz.javacafe.service.JavaCafeServiceImpl;

@Controller("controller.addCafeController")
@RequestMapping("addCafe/addCafe")
public class AddCafeController {
	JavaCafeService service = new JavaCafeServiceImpl();

	@GetMapping
	public String addCafeForm(Model model) {
		model.addAttribute("cafe", new Cafe());
		model.addAttribute("javacate", service.selectHighCate());
		return "addCafe/addCafe";
	}

	@PostMapping
	public String addCafe(@RequestParam("file") MultipartFile file, HttpServletRequest request, Model model) {
		Cafe cafe = new Cafe();
		cafe.setName(request.getParameter("name"));
		cafe.setHighCateGory(request.getParameter("highCateGory"));
		cafe.setLowCateGory(request.getParameter("lowCateGory"));
		cafe.setPrice(Integer.parseInt(request.getParameter("price")));
		cafe.setStock(Integer.parseInt(request.getParameter("stock")));
		String fileRealName = file.getOriginalFilename();
		System.out.println("이름: " + file.getOriginalFilename());

		String fileExtension = fileRealName.substring(fileRealName.lastIndexOf("."), fileRealName.length());
		String uploadFolder = "C:/lty/workspace/javacafe/src/main/webapp/resources/fileimg";
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid.toString());
		String[] uuids = uuid.toString().split("-");
		String uniqueName = uuids[0];
		System.out.println("문자열: " + uniqueName);
		System.out.println("확장자: " + fileExtension);
		File saveFile = new File(uploadFolder + "/" + uniqueName + fileExtension);
		String imgUrl = (uniqueName + fileExtension);
		cafe.setImgUrl(imgUrl);
		try {
			file.transferTo(saveFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("cafe", cafe);
		service.addCafe(cafe);
		JavaCafeService.context.close();
		return "addCafe/addCafeSuccess";
	}
}
