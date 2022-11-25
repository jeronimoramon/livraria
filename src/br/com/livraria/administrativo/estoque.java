package br.com.livraria.administrativo;

import java.util.ArrayList;
import java.util.List;

import br.com.livraria.produto.Produto;

public class Estoque<T extends Produto> {
private List<T> estoqueProduto = new ArrayList<>();
public List<T> getTodoEstoqueProduto() {
	return this.estoqueProduto;
}

public T getProdutoPorId(Integer id) {
	for (T t : estoqueProduto) {
		if(t.getIdProduto().equals(id)) {
			return t;
		}
	}
	return null;
}
public void insereProduto(T produto) {
	if (estoqueProduto.contains(produto) == false) {
		estoqueProduto.add(produto);
	}
}
public void alteraProduto(Integer id, T produto) {
	for(T t : estoqueProduto) {
		if(t.getIdProduto().equals(id)) {
			removeProduto(produto);
			insereProduto(produto);
			
		}
	}
}
public void removeProduto(T produto) {
	estoqueProduto.remove(produto);
}
}