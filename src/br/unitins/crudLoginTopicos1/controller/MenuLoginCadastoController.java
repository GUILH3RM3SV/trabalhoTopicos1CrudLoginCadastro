package br.unitins.crudLoginTopicos1.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named
public class MenuLoginCadastoController {
	public String redirectLogin() {
		return "login.xhtml?faces-redirect=true";
	}
	
	public String redirectCadastroPessoa() {
		return "cadastroPessoa.xhtml?faces-redirect=true";
	}
	
	public String redirectCadastroProdutos() {
		return "cadastroProdutos.xhtml?faces-redirect=true";
	}
}
