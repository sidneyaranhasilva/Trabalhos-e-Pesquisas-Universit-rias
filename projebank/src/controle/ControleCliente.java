package controle;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import modelo.Cliente;
import modelo.ClienteDAO;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("inicio")
public class ControleCliente {

	@Autowired
	ClienteDAO clieDAO;


	@RequestMapping(value = "novo", method = RequestMethod.GET)
	private ModelAndView home(Cliente cliente, Model model) {

		System.out.println("passei por aqui");
		model.addAttribute("data_enviada", new Date());

		List<Cliente> clientes = clieDAO.listar();

		
		return new ModelAndView("cadastroCliente", "clientes", clientes) ;
	}

	@RequestMapping(value = "salvar", method = RequestMethod.POST)
	private ModelAndView salvar(Cliente cliente) {
		

		System.out.println("Passei por  salvar cliente" + cliente.toString());
		
			clieDAO.salvar(cliente);

			List<Cliente> clientes = clieDAO.listar();
			
			
			
			

		return new ModelAndView("cadastroCliente", "clientes", clientes );
	}
	
	
	@RequestMapping(value = "efetivarAlteracao", method = RequestMethod.POST)
	private ModelAndView efetivarAlteracao(Cliente cliente) {
		
		System.out.println("Passei por  deletar cliente" + cliente.toString());
		
		
		clieDAO.atualizar(cliente);

		List<Cliente> clientes = clieDAO.listar();

		

		return new ModelAndView("cadastroCliente", "clientes", clientes );
	}

	@RequestMapping(value = "deletar", method = RequestMethod.GET)
	private ModelAndView deletar(int id) {

		Cliente cliente = new Cliente();

		clieDAO.deletar(id);

		List<Cliente> clientes = clieDAO.listar();

		System.out.println("Passei por  deletar cliente" + id);

		return new ModelAndView("cadastroCliente", "clientes", clientes);
	}

	@RequestMapping(value = "alterar", method = RequestMethod.GET)
	private String alterar(int id, Cliente cliente, Model model) {


		cliente = clieDAO.getByCodigo(id);
		
		

		

		model.addAttribute("cliente", cliente);

		

		System.out.println("Passei por  deletar cliente" + id);

		

		return "AlterarCadastroCliente";
	}

}
