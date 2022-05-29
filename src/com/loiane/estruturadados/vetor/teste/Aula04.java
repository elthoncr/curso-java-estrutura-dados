package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula04 {

	public static void main(String[] args) {


		Vetor vetor = new Vetor(10);

		vetor.adiciona("Elemento 1");
		vetor.adiciona("Elemento 2");
		vetor.adiciona("Elemento 3");
		
		System.out.println(vetor.tamanho());
		
		
		System.out.println(vetor.toString());
	}

}
