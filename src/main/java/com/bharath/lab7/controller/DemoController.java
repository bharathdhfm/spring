package com.bharath.lab7.controller;


	import org.springframework.web.bind.annotation.*;

import com.bharath.lab7.model.Customer;

import java.util.ArrayList;
	import java.util.List;

	@RestController
	@RequestMapping("/api")
	public class DemoController {
	    private List<Customer> customers = new ArrayList<>();

	    @GetMapping("/demo1")
	    public int demo1() {
	        return 42; // Example integer
	    }

	    @GetMapping("/demo2")
	    public double demo2() {
	        return 3.14; // Example double value
	    }

	    @GetMapping("/demo3")
	    public String demo3() {
	        return "<h1>Hello, this is a formatted HTML string!</h1>";
	    }

	    @GetMapping("/demo4")
	    public String demo4() {
	        String str = "KLEF";
	        return "I Study at " + str;
	    }

	    @GetMapping("/demo5/{id}")
	    public String demo5(@PathVariable String id) {
	        return id;
	    }

	    @GetMapping("/demo6/{a}/{b}")
	    public String demo6(@PathVariable int a, @PathVariable int b) {
	        return String.valueOf(a + b);
	    }

	    @GetMapping("/demo7")
	    public String demo7(@RequestParam String id) {
	        return id;
	    }

	    @GetMapping("/demo8/{name}")
	    public String demo8(@PathVariable String name) {
	        return name;
	    }

	    @PostMapping("/addcustomer")
	    public String addCustomer(@RequestBody Customer customer) {
	        customers.add(customer);
	        return "Customer Added Successfully";
	    }

	    @GetMapping("/viewcustomer")
	    public List<Customer> viewCustomer() {
	        return customers;
	    }

}
