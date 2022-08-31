package com.nt.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;
import com.nt.rest.View;
import com.nt.rest.View.Internal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties(value = {"id","name"},ignoreUnknown = false)
public class Order {


	private Integer id;

	@JsonView(value = View.External.class)
	private String name;

	@JsonView(value = View.External.class)
	private String addrs;

	@JsonView(value = View.External.class)
	private String ssn;
	


}
