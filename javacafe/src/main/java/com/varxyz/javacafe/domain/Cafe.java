package com.varxyz.javacafe.domain;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Cafe {
	private double cafeid;
	private double price;
	private double stock;
	private String name;
	private String highCateGory;
	private String lowCateGory;
	private MultipartFile file;
	private String imgUrl;
}