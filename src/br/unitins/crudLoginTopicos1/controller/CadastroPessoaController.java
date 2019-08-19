package br.unitins.crudLoginTopicos1.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.unitins.crudLoginTopicos1.model.CadastroPessoaModel;

@Named
@RequestScoped
public class CadastroPessoaController {
	private CadastroPessoaModel cadastroPessoaModel;

	public void limparDados() {
		setCadastroPessoaModel(new CadastroPessoaModel());
	}

	public String redirectMenuLoginCadastro() {
		return "menuLoginCadastro.xhtml?faces-redirect=true";
	}

	public void incluirDados() {
		System.out.println("Nome: " + getCadastroPessoaModel().getNome());
		System.out.println("Login: " + getCadastroPessoaModel().getLogin());
		System.out.println("Senha: " + getCadastroPessoaModel().getSenha());
		System.out.println("Ativo? " + getCadastroPessoaModel().getAtivo());
		System.out.println("\n");

	}

	// Metodos GETTERS e SETTERS
	public CadastroPessoaModel getCadastroPessoaModel() {
		if (cadastroPessoaModel == null)
			cadastroPessoaModel = new CadastroPessoaModel();
		return cadastroPessoaModel;
	}

	public void setCadastroPessoaModel(CadastroPessoaModel cadastroPessoaModel) {
		this.cadastroPessoaModel = cadastroPessoaModel;
	}
}
