package com.strategy.nadadores;

import com.strategy.impl.EstiloNado;

public abstract class Nadador {

	private String nome;
	private int idade;

	EstiloNado nado;

	public void iniciarNado() {
		nado.nadar();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}