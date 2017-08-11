package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.models.Adder;
import com.example.demo.models.Divider;
import com.example.demo.models.Exponent;
import com.example.demo.models.Modulus;
import com.example.demo.models.Multiplier;
import com.example.demo.models.Subtracter;

@Controller

public class CalculatorController {
	
//GET Mappings
@GetMapping("/calculator")
public String index() {
	return "calculator/index";
}

//POST Mappings
@PostMapping("calculator/calculate")
public ModelAndView calculate(@RequestParam(name="number1") int first, @RequestParam(name="number2") double second, @RequestParam(name="value") String mathOperator, Model model) {
	Double result = null;
	
	switch (mathOperator) {
	//If the mathOperator is "+" call the adder method
	case "+": Adder adder = new Adder(first, second);
			  result = adder.sum();
			  break;
	
	//If the mathOperator is "-" call the subtracter method
	case "-": Subtracter subtracter = new Subtracter(first, second);
			  result = subtracter.difference();
			  break;
	
	//If the mathOperator is "*" call the multiplier method
	case "*": Multiplier multiplier = new Multiplier(first, second);
			  result = multiplier.product();
			  break;
			  
	//If the mathOperator is "/" call the divider method		  
	case "/": Divider divider = new Divider(first, second);
			  result = divider.quotient();
			  break;
			  
	//If the mathOperator is "%" call the modulus method		  
	case "%": Modulus modulus = new Modulus(first, second);
			  result = modulus.remainder();
			  break;			  
	
	//If the mathOperator is "^" call the exponent method
	case "^": Exponent exponent = new Exponent(first, second);
			  result = exponent.power();
			  break;
	}
	
	ModelAndView mv = new ModelAndView("calculator/calc-result");
	mv.addObject("result", result);
	
	 return mv;
	}
}
