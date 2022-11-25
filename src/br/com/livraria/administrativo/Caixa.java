package br.com.livraria.administrativo;

import br.com.livraria.produto.Livro;
import br.com.livraria.produto.Produto;

public class Caixa {
	public static Estoque<Produto> estoqueList = new Estoque<>();
	private double Dinheiro;

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.setIdProduto(1);
		livro.setNome("codigoLimpo");
		livro.setGeneros("informatica");
		estoqueList.insereProduto(livro);

	}

	public void comprar(Integer idProduto, double preco) {
		Produto produtotemporario = estoqueList.getProdutoPorId(idProduto);
		if (produtotemporario.getPreco() <= preco) {
			estoqueList.removeProduto(produtotemporario);
			Dinheiro = Dinheiro + produtotemporario.getPreco();
		}

	}
}
