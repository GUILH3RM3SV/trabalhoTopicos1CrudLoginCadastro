package br.unitins.crudLoginTopicos1.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.unitins.crudLoginTopicos1.model.LoginModel;

@Named
@RequestScoped
public class LoginController {
	private LoginModel loginModel;
	
	public String redirectMenuLoginCadastro() {
		return "menuLoginCadastro.xhtml?faces-redirect=true";
	}
	
	public void logar() {
		System.out.println("nome: " + getLoginModel().getNome());
		System.out.println("senha: " + getLoginModel().getSenha());
	}
	
	//Metodos GETTERS e SETTERS
	public LoginModel getLoginModel() {
		if(loginModel == null)
			loginModel = new LoginModel();
		return loginModel;
	}

	public void setLoginModel(LoginModel loginModel) {
		this.loginModel = loginModel;
	}
}
