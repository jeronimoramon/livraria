package br.com.livraria.administrativo;

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
public class Comprador {
private String nome;
private Integer idade;
private String rg;
private String cpf;

}
