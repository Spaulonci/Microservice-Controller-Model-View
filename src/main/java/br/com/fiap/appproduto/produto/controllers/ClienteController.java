package br.com.fiap.appproduto.produto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClienteController {
	
	@GetMapping("/clientes")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("clientes/index");
		
		return model;
	}

}
