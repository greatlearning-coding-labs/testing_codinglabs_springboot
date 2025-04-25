package com.gl.codelab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ForCodeLabTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForCodeLabTestApplication.class, args);
	}
	public static String reverseWords(String a) {
		return new StringBuffer(a).reverse().toString();
	}
}
