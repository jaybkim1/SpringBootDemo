package com.example.jsp.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jsp.dao.Topic;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String index(Model model) {
		model.addAttribute("name", "Spring Boot with ThymeLeaf");
		return "hello";
	}

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("spring", "Spring Framework", "Spring Framework Desc"),
				new Topic("java", "Core Java", "Core Java Desc"),
				new Topic("javascript", "JavaScript", "JavaScript Desc")
				);
	}
	
	@RequestMapping("/lombok")
	public List<Topic> lombok() {
		return Arrays.asList(
				new Topic("lombok", "Spring Framework", "Spring Framework Desc"),
				new Topic("lombok", "Core Java", "Core Java Desc"),
				new Topic("lombok", "JavaScript", "JavaScript Desc")
				);
	}
	
}