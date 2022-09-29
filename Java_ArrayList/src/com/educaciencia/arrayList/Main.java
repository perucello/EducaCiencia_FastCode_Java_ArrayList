package com.educaciencia.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

/**************************************
 * ******* EDUCACIENCIA FASTCODE ******
 * ******* MANIPULANDO LISTAS *********
 * *******     29/09/2022     *********
 **************************************/

public class Main {

	public static void main(String[] args) {		
		addDadosArrayList();
		buscaNomeListaPorPosicao();
		limpaListaClear();
		limpaListaRemoveAll();
		removeDadoLista();
		atualizaDadoLista();
	}
	
	/* Adicionando dados em uma ArrayList */
	public static void addDadosArrayList() {
		System.out.println("----------- EDUCACIENCIA FASTCODE - ARRAYLIST ------------------");
		ArrayList<String> listaNome = new ArrayList<>();
		listaNome.add("EducaCiencia FastCode");
		listaNome.add("CobraDev");
		System.out.println("Lista: " + Arrays.toString(listaNome.toArray()));
	}
	
	/* Buscando Nome na lista por posição */
	public static void buscaNomeListaPorPosicao() {
		System.out.println("----------- EDUCACIENCIA FASTCODE - ARRAYLIST ------------------");
		ArrayList<String> listaNome = new ArrayList<>();
		listaNome.add("EducaCiencia FastCode"); // posicao 0 na Lista
		listaNome.add("CobraDev"); // posicao 1 na lista
		System.out.println("Buscando nome da posição 1 " + listaNome.get(1)); // buscando posicao 1 = CobraDev
		System.out.println("Buscando nome da posição 0 " + listaNome.get(0)); // buscando posicao 0 = Educa
	}
	
	/* limpando lista utilizando Clear*/
	public static void limpaListaClear() {
		System.out.println("----------- EDUCACIENCIA FASTCODE - ARRAYLIST ------------------");
		ArrayList<String> listaNome = new ArrayList<>();
		listaNome.add("EducaCiencia FastCode"); // posicao 0 na Lista
		listaNome.add("CobraDev"); // posicao 1 na lista
		System.out.println("Lista Atual: " + Arrays.toString(listaNome.toArray()));
		System.out.println(" *****  removendo dados da lista ******");
		listaNome.clear();
		System.out.println("Lista Atualizada: " + Arrays.toString(listaNome.toArray()));
	}
	
	/* limpando lista utilizando RemoveAll*/
	public static void limpaListaRemoveAll() {
		System.out.println("----------- EDUCACIENCIA FASTCODE - ARRAYLIST ------------------");
		ArrayList<String> listaNome = new ArrayList<>();
		listaNome.add("EducaCiencia FastCode"); // posicao 0 na Lista
		listaNome.add("CobraDev"); // posicao 1 na lista
		System.out.println("Lista Atual: " + Arrays.toString(listaNome.toArray()));
		System.out.println(" *****  removendo dados da lista ******");
		listaNome.removeAll(listaNome); // removendo dados da Lista
		System.out.println("Lista Atualizada: " + Arrays.toString(listaNome.toArray()));
	}

	/* excluindo dado da lista utilizando Remove*/
	public static void removeDadoLista() {
		System.out.println("----------- EDUCACIENCIA FASTCODE - ARRAYLIST ------------------");
		ArrayList<String> listaNome = new ArrayList<>();
		listaNome.add("EducaCiencia FastCode"); // posicao 0 na Lista
		listaNome.add("CobraDev"); // posicao 1 na lista
		System.out.println("Lista Atual: " + Arrays.toString(listaNome.toArray()));
		System.out.println(" *****  removendo dados da lista ******");
		listaNome.remove("CobraDev"); // removendo CobraDev
		System.out.println("Lista Atualizada: " + Arrays.toString(listaNome.toArray()));
	}
	
	/* Atualizando dado na Lista */
	public static void atualizaDadoLista() {
		System.out.println("----------- EDUCACIENCIA FASTCODE - ARRAYLIST ------------------");
		ArrayList<String> listaNome = new ArrayList<>();
		listaNome.add("EducaCiencia FastCode"); // posicao 0 na Lista
		listaNome.add("CobraDev"); // posicao 1 na lista
		System.out.println("Lista Atual: " + Arrays.toString(listaNome.toArray()));
		System.out.println(" *****  atualizando dado na lista ******");
		listaNome.set(listaNome.indexOf("EducaCiencia FastCode"), "EDUCACIENCIA FASTCODE"); // atualizado nome EducaCiencia FastCode para EDUCACIENCIA FASTCODE
		System.out.println("Lista Atualizada: " + Arrays.toString(listaNome.toArray()));
	}

	
}
