package com.market.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.market.model.FakeObject;

@RestController
//CrossOrigin gives permission to our Angular application to POST to this controller
//angular.url can be found in application.properties
@CrossOrigin(origins="${angular.url}")
@RequestMapping("/delivery")
public class DeliveryController {
	
	@RequestMapping(value="/orders", method=RequestMethod.GET)
	public List<FakeObject> getAllOrders() {
		return Arrays.asList(
				new FakeObject("ID123"),
				new FakeObject("ID4567"),
				new FakeObject("ID890")
				);
	}
	
	@RequestMapping(value="/orders/{id}", method=RequestMethod.GET)
	public FakeObject getOrder(@PathVariable("id") String id) {
		return new FakeObject(id);
	}

	@RequestMapping(value="/orders", method=RequestMethod.POST)
	public FakeObject printOrder(@RequestBody String id) {
		System.out.print("(!) ID of post object: " + id);
		return new FakeObject(id);
	}
	
}
