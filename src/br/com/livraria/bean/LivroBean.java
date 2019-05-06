package br.com.livraria.bean;

import javax.faces.bean.ManagedBean;

import br.com.livraria.domain.Livro;

@ManagedBean
public class LivroBean {
	
	Livro livro = new Livro();
	
	public Livro getLivro() {
		return livro;
	}
	
	public void gravar() {
		System.out.println("Gravando o livro " + this.livro.getTitulo());
	}
}
