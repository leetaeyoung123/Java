package com.varxyz.javacafe.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Category {
	private String categoryname;
	
	public String toString() {
		return categoryname;
	}
}
