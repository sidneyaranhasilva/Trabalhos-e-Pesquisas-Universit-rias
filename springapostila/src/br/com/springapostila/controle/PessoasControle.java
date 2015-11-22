
package br.com.springapostila.controle;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PessoasControle {

	@RequestMapping(value = "listar")
	public ModelAndView listar(){
		
		List<String> nomes = new ArrayList<String>();
		nomes.add("Pedro");
	
		
	
		return new ModelAndView("listar/Listar", "listaNome", nomes );
		
	}
	
}
