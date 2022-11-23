package br.com.livraria.administrativo;

import java.util.ArrayList;
import java.util.List;

import br.com.livraria.produto.Produto;

public class estoque<T extends Produto> {
private List<T> estoqueProduto = new ArrayList<>();
public List<T> getEstoqueProduto() {
	return this.estoqueProduto;
}
}
