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
public class Filme extends Produto{
private String Estudio;
private String diretores;
private String generos;
private String produtores;
}
