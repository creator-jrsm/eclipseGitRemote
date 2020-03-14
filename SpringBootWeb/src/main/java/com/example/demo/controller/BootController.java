package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.Product;

@Controller
public class BootController {

	@ResponseBody
	@RequestMapping("/request")
	public String test()
	{
		return "hello spring boot";
	}
	
	@RequestMapping("/welcome")
	public String welcome(Map<String,Object>map)
	{		
		//给thymeleaf准备数据
		map.put("welcome", "welcome come to thymeleaf");
	
		List<Product> prods=new ArrayList<>();
		prods.add(new Product("a",100,10));
		prods.add(new Product("b",200,20));
		prods.add(new Product("c",300,30));
		map.put("prods", prods);
		return "result";
	}
}
