package br.com.livraria.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.livraria.dao.UsuarioDAO;
import br.com.livraria.modelo.Usuario;

@ManagedBean
@ViewScoped
public class LoginBean {

	private Usuario usuario = new Usuario();
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public String efetuarLogin() {
		System.out.println("Efetando o login do usu�rio " + this.usuario.getEmail());
		
		boolean existe = new UsuarioDAO().existe(usuario);
		if (existe) {
			return "livro?faces-redirect=true";
		}
		return null;
	}
	
	
	
	
	
	
	
}
