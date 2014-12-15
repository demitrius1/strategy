package com.strategy.app;

import com.strategy.nadadores.Nadador;
import com.strategy.nadadores.NadadorEstiloBorboleta;
import com.strategy.nadadores.NadadorEstiloLivre;
import com.strategy.nadadores.NadadorEstiloPeito;

public class CursoNatacao {

	public static void main(String[] args) {
		System.out.println
		(
		"==================== \n" +
		"CURSO DE NATAÇÃO \n" +
		"===================="
		);
		Nadador estiloLivre = new NadadorEstiloLivre();
		estiloLivre.iniciarNado();
		Nadador estiloPeito = new NadadorEstiloPeito();
		estiloPeito.iniciarNado();
		Nadador estiloBorboleta = new NadadorEstiloBorboleta();
		estiloBorboleta.iniciarNado();
	}

}