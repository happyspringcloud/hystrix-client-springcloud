package com.springcloud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class CafeController {

	@Autowired
	private CafeService cafeService; 
	
	@GetMapping("/delay/{param}")
	@ApiOperation(value="지연이 있는 서비스 ")
	public List<String> getCoffeeAll(@PathVariable String param) {
		return cafeService.getCoffee(param);
	}

	@GetMapping("/nodelay")
	@ApiOperation(value="지연이 없는 서비스 ")
	public List<String> getJuiceAll() {
		return cafeService.getJuice();
	}
}
