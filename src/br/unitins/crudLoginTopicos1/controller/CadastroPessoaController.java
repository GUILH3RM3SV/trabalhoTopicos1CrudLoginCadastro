package br.unitins.crudLoginTopicos1.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.unitins.crudLoginTopicos1.model.CadastroPessoaModel;

@Named
@RequestScoped
public class CadastroPessoaController {
	private CadastroPessoaModel cadastroPessoaModel;
	
	public String redirectMenuLoginCadastro() {
		return "menuLoginCadastro.xhtml?faces-redirect=true";
	}

	//Metodos GETTERS e SETTERS
	public CadastroPessoaModel getCadastroPessoaModel() {
		return cadastroPessoaModel;
	}

	public void setCadastroPessoaModel(CadastroPessoaModel cadastroPessoaModel) {
		this.cadastroPessoaModel = cadastroPessoaModel;
	}
	
	
}
