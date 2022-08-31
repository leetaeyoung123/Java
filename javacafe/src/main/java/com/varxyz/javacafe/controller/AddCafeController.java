package com.varxyz.javacafe.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
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
		
		if(request.getParameter("name") == null || request.getParameter("name") =="" || request.getParameter("name").length() == 0) {
			model.addAttribute("msg", "메뉴 이름을 입력해주세요.");
			return "error";
		}
		
		List<Cafe> list = service.findAllMenu();
		List<String> nameList = new ArrayList<>();
		
		for(int i = 0; i < list.size(); i++) {
			nameList.add(list.get(i).getName());
			if(service.findAllMenu().size() != 0) {
				if(request.getParameter("name").equals(nameList.get(i))) {
					model.addAttribute("msg", "메뉴 이름이 중복됩니다.");
					return "error";
				}
			}
		}

		model.addAttribute("cafe", cafe);
		service.addCafe(cafe);
		return "addCafe/addCafeSuccess";
	}
}
