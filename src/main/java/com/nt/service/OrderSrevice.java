package com.nt.service;

import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.nt.model.Order;

@Service
public class OrderSrevice {

	public Optional<Order> getOneId(Integer id) {
		Order order = new Order( new Random().nextInt(), "pooja", "usa", "s-123");
	 Optional<Order> opt = Optional.of(order);
	 return opt;
	}
	
}
