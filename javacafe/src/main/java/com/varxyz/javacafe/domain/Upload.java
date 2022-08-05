package com.varxyz.javacafe.domain;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Upload {
	private String name;
	private MultipartFile file;
}
