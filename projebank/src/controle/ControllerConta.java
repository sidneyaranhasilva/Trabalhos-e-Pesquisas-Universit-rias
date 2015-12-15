package controle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import modelo.Cliente;
import modelo.ClienteDAO;
import modelo.Conta;
import modelo.ContaDAO;
import modelo.Movimentacao;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("conta")
public class ControllerConta {

	@Autowired
	ClienteDAO clienteDAO;

	@Autowired
	ContaDAO contaDAO;

	@RequestMapping(value = "ListarClietes", method = RequestMethod.GET)
	private ModelAndView home(Conta conta) {

		System.out.println("passei por Conta");

		List<Cliente> clientes = clienteDAO.listar();

		return new ModelAndView("ListarCliesteParaConta", "clientes", clientes);
	}

	@RequestMapping(value = "criarConta", method = RequestMethod.GET)
	private String criarConta(int id, Cliente cliente, Model model) {

		cliente = clienteDAO.getByCodigo(id);

		model.addAttribute("cliente", cliente);

		System.out.println("Passei inicio criar Conta" + id);

		return "CadastroDeConta";
	}

	@RequestMapping(value = "efetivarConta", method = RequestMethod.POST)
	private ModelAndView EfetivarConta(Cliente cliente, Conta conta) {

		
		
		conta.setCliente(cliente);
		
		
		contaDAO.salvar(conta);
		
		

		cliente = clienteDAO.clienteporid(cliente.getId());

		System.out.println("verificar contas para o cliente");

		return new ModelAndView("CostasParaCliente", "cliente", cliente);
		
	}

	@RequestMapping(value = "clientecontas", method = RequestMethod.GET)
	private ModelAndView clientecontas(int id, Cliente cliente, Conta conta) {
		
		cliente = clienteDAO.clienteporid(id);
		
		System.out.println("verificar contas para o cliente");
		
		

		return new ModelAndView("CostasParaCliente", "cliente", cliente);

	}

	@RequestMapping(value = "clienteNome", method = RequestMethod.GET)
	private ModelAndView listarCliente(String nome, Cliente cliente) {

		List<Cliente> clientes = clienteDAO.clienteNome(nome);

		System.out.println("verificar contas para o cliente"
				+ cliente.getNome());

		return new ModelAndView("ListarCliesteParaConta", "clientes", clientes);
	}

	@RequestMapping(value = "movimentar", method = RequestMethod.GET)
	private ModelAndView movimentar(int id, Conta conta) {

		conta = contaDAO.getByCodigo(id);

		return new ModelAndView("movimentarConta", "conta", conta);
	}

	@RequestMapping(value = "efetivarMovimentacao", method = RequestMethod.POST)
	private String efetivarMovimentacao(Movimentacao movimentacao, Conta conta,
			Model model) {

		System.out.println(movimentacao.toString());

		conta = contaDAO.getByCodigo(movimentacao.getIdconta());

		if (movimentacao.getTipomovimentacao().equals("saque")) {
			System.out.println("saque");
			if (conta.getSaldo() - movimentacao.getValor() < 0) {
				System.out
						.println("Saque maior que o saldo operação não permitida");
			} else {

				conta.setSaldo(conta.getSaldo() - movimentacao.getValor());
				contaDAO.atualizar(conta);
			}

		} else {

			System.out.println("deposito");

			conta.setSaldo(conta.getSaldo() + movimentacao.getValor());
			contaDAO.atualizar(conta);

		}

		conta = contaDAO.getByCodigo(movimentacao.getIdconta());

		model.addAttribute("conta", conta);
		return "movimentarConta";
	}

}
