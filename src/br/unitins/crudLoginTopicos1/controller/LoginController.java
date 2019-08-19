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
	
	public String logar() {
		if (getLoginModel().getNome().equals("teste") && getLoginModel().getSenha().equals("123")) {
			return "menuLoginCadastro.xhtml?faces-redirect=true";
		}
		application.Util.addMessageError("Login ou senha incorreto");
		return null;
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
