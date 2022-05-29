package com.loiane.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("");
		
		System.out.println(arrayList);
		
		arrayList.add(1, "C");
		
		System.out.println(arrayList);
		
		boolean existe = arrayList.contains("A");
		
		if(existe) {
			System.out.println("Contem a letra 'A' no array");
		} else {
			System.out.println("Não contem a letra 'A' no array");
		}
		
		int pos = arrayList.indexOf("B");
		
		if(pos > -1) {
			System.out.println("Elemento existe no array " + pos);
		} else {
			System.out.println("Elemento não existe no array " + pos);
		}
		
		System.out.println(arrayList.get(2));
		
		arrayList.remove(0);
		arrayList.remove("B");
		
		System.out.println(arrayList);
		
		System.out.println(arrayList.size());
		
		
	}

}
