package br.com.fiap.appproduto.produto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"br.com.fiap.appproduto.produto.controllers"})
public class ProdutoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutoApplication.class, args);
	}

}
