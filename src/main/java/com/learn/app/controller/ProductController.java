package com.learn.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.learn.app.model.Product;
import com.learn.app.service.ProductService;

@Controller
public class ProductController {

	private ProductService service;
	
	@Autowired
	public ProductController(ProductService service) {
		super();
		this.service = service;
	}

	@GetMapping("/productform")
	public String showProductForm() {
		return "productform";
	}
	
	@PostMapping("/addproduct")
	public String addProduct(@ModelAttribute Product product) {
		service.addProduct(product);
		return "redirect:/productlist";
	}
	
	@GetMapping("/productlist")
	public String productList(Model model) {
		List<Product> allProducts = service.getAllProducts();
		model.addAttribute("products", allProducts);
		return "productlist";
	}	
}