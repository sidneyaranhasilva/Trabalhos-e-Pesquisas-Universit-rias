package br.com.springapostila.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import org.springframework.stereotype.Component;


@Component
public class ProdutoDAO {

	private static List<Produto> BancoDeDados = new ArrayList<Produto>();
	private static int cont = 0;

	

	public void gravar(Produto produto) {

		produto.setId(cont++);

		BancoDeDados.add(produto);
	}

	public void deletar(Integer codigo) {
		for (Iterator<Produto> it = BancoDeDados.iterator(); it.hasNext();) {
			Produto medico = it.next();
			if (medico.getId().equals(codigo)) {
				BancoDeDados.remove(medico);
				break;
			}
		}

	}

	public void alterar(Produto produto) {
		for (Produto produtoBD : BancoDeDados) {
			if (produtoBD.getId().equals(produto.getId())) {
				produtoBD.setNome(produto.getNome());

			}
		}
	}

	public Produto obterAutorPeloCodigo(Integer codigo) {
		for (Produto produto : BancoDeDados) {
			if (produto.getId().equals(codigo))
				return produto;
		}
		return null;
	}

	public List<Produto> listar() {
		return BancoDeDados;
	}

}
