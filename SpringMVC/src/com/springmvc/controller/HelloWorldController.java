package com.springmvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HelloWorldController {
 
	@RequestMapping(method=RequestMethod.GET)
	public String hello(ModelMap model){
		System.out.println("Hello World!!!");
		model.addAttribute("message","Hello World!!!");
		return "welcome";
	}
	
	@RequestMapping(value="/patel",method=RequestMethod.GET, params={"age","name"})
	public String helloName(ModelMap model){
		System.out.println("Hello World Name!!!");
		model.addAttribute("message","Hello World Name!!!");
		return "welcome";
	}
 
    @RequestMapping(value="/helloagain", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
        model.addAttribute("message", "Hello World Again, from Spring 4 MVC");
        return "welcome";
    }
 
    @RequestMapping("/StudentForm")
    public String studentForm(){
    	System.out.println("in studentform");
    	return "StudentForm";
    }
    
    @RequestMapping(value="/successForm", method=RequestMethod.POST)
    public ModelMap submitForm(@RequestParam Map<String, String> params){
    	System.out.println("\t in submit form");
    	System.out.println("params === "+params);
    	ModelMap model=new ModelMap("successForm");
    	
    	return model;
    }
}