package com.varxyz.javacafe.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cafe {
	private double cafeid;
	private double price;
	private double stock;
	private String name;
	private String highCateGory;
	private String lowCateGory;
}
