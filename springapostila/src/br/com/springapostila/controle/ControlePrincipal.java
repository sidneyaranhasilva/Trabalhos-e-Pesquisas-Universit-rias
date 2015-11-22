package br.com.springapostila.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControlePrincipal {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView  iniciar(){
		
		System.out.println("Passei pelo metodo hello do controller pessoa");
		
		return new ModelAndView("FormPrincipal");
		
	}
	
	@RequestMapping(value = "sair", method = RequestMethod.GET)
	public ModelAndView  sair(){
		
		System.out.println("Passei pelo metodo hello do controller pessoa");
		
		return new ModelAndView("Fim");
		
	}
	
}
