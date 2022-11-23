package br.com.livraria.produto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

	@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Livro extends Produto{
private String generos;
private String escritor;
private String editora;
}
