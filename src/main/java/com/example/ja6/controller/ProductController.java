package com.example.ja6.controller;


import com.example.ja6.entity.Product;
import com.example.ja6.service.impl.ProducService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {
	@Autowired
	ProducService producService;
	@RequestMapping("/product/list")
	public String list(Model model, @RequestParam("cid")Optional<String> cid) {
		if (cid.isPresent()) {
			List<Product> list = producService.findbyCategoryId(cid.get());
			model.addAttribute("items",list);

		}else {List<Product> list = producService.findALl();
			model.addAttribute("items",list);}


		return "pro/list";
	}
	@RequestMapping("/product/detai/{id}")
	public String detail(Model model, @PathVariable("id") Integer id) {
		Product item = producService.findById(id);
		System.out.println(item);
		model.addAttribute("item",item);

		return "pro/detail";
	}
	

}
