package br.com.alura.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	// end-point
	@RequestMapping("/") // mapeia o end-point
	@ResponseBody // devolve a resposta no body
	public String hello()
	{
		return "Hello World";
	}
}
