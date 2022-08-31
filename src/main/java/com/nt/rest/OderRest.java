package com.nt.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.nt.model.Order;
import com.nt.service.OrderSrevice;

@RestController
public class OderRest {

	@Autowired
	private OrderSrevice service;
	
	@GetMapping("/get/ex")
	@JsonView(value = View.External.class)
	public Optional<Order> getById(Integer id) {
		Optional<Order> opt = service.getOneId(id);
		System.err.println(opt.get());
		
		return opt;
	}
	

	
	@GetMapping("/get/in")
	@JsonView(value = View.Internal.class)
	public Optional<Order> getByIdInternal(Integer id) {
		Optional<Order> opt = service.getOneId(id);
		return opt;
	}
	
	@PostMapping("/save")
	public Order saveOrder(@RequestBody Order order) {
		System.out.println(order);
		return order;
	}


}
