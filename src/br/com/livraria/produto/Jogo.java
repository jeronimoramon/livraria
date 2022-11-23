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
public class Jogo extends Produto{
private String distribuidora;
private String genero;
private String estudio;
}
