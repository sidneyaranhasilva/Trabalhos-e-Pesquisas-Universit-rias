package br.com.springapostila.controle;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.springapostila.modelo.Produto;
import br.com.springapostila.modelo.ProdutoDAO;

@Controller
public class ProdutoController {

	@Autowired
	ProdutoDAO dao;

	@RequestMapping(value = "produto", method = RequestMethod.GET)
	public ModelAndView produto() {

		System.out.println("Passei pelo metodo hello do controller pessoa");

		return new ModelAndView("listar/NovoProduto");

	}

	@RequestMapping(value = "listarProduto")
	public ModelAndView listarProduto(HttpSession session) {

		List<Produto> produtos = new ArrayList<Produto>();

		produtos = dao.listar();

	

		return new ModelAndView("listar/ListarProduto", "ListaProdutos", produtos );

	}

	@RequestMapping(value = "salvarProduto", method = RequestMethod.POST)
	public ModelAndView salvarProduto(Produto produto) {

		dao.gravar(produto);

		System.out.println("PASSEI POR SALVAR PRODUTO");
		System.out.println("Produto: " + produto.getNome());

		String mensagem = "Produto Cadastrado com sucesso.";

		return new ModelAndView("listar/NovoProduto", "mensagem", mensagem);

	}

}
