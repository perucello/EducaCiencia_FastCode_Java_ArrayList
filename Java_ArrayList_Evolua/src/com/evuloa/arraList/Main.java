package com.evuloa.arraList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
/**************************************
 * ******* EDUCACIENCIA FASTCODE ******
 * ******* MANIPULANDO LISTAS *********
 * *******     30/09/2022     *********
 **************************************/

/*
	Comando				Função																				Exemplo
	add					Inserir um Elemento em uma Posição Específica										Lista.add(“xxxx”);
	get(index)			Imprimir Apenas um Elemento do ArrayList											Lista.get(1);
	toString()			Imprimir Todos os  Elementos Contidos no ArrayList									Lista.toString();
	remove()			Remover um Elemento do ArrayList													Lista.remove(“xxxx”);
	set(index)			Substituir um Elemento do ArrayList													Lista.set(2, “xxxx”);
	size()				Retorna a Quantidade de Elemento no ArrayList										Lista.size()
	contains()			Verificar se Contém um Elemento Especifico no ArrayList								Lista.contains(“xxxx”)
	indexOf()	 		Retorna a Posição da Primeira Ocorrência de um Elemento Especifico					Lista.indexOf(“xxxx”)
	lastIndexOf()		Retorna a Posição da Última Ocorrência de um Elemento Especifico					Lista.lastIndexOf(“xxxx”)
	isEmpty()			Verificar se o ArrayList está Vazio													Lista.isEmpty();
	clear()				Remover Todos os Elementos do ArrayList												Lista.clea();
	addAll()			Adicionar os Elementos de um ArrayList no final de Outro ArrayList					Lista.addAll(Objetos);
	addAll(index)		Adicionar os Elementos de um ArrayList em um Índice Específico em Outro ArrayList	Lista.addAll(1, Objetos);
	Collections.sort()	Ordenar os elementos Contidos em um ArrayList										Collections.sort(Lista);
 */
public class Main {

	public static void main(String[] args) {
		 addDadosArrayList();
		 buscaNomeListaPorPosicao();
		 limpaListaClear();
		 limpaListaRemoveAll();
		 removeDadoLista();
		 atualizaDadoLista();
		 qtdeDadoLista();
		 BuscaDeterminadoDadoLista();
		 ordenaDadoLista();

		 AgendaTelefone();
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

	/* limpando lista utilizando Clear */
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

	/* limpando lista utilizando RemoveAll */
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

	/* excluindo dado da lista utilizando Remove */
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
		listaNome.set(listaNome.indexOf("EducaCiencia FastCode"), "EDUCACIENCIA FASTCODE"); // atualizado nome
		System.out.println("Lista Atualizada: " + Arrays.toString(listaNome.toArray()));
	}

	/* retorna qtde dado na Lista */
	public static void qtdeDadoLista() {
		System.out.println("----------- EDUCACIENCIA FASTCODE - ARRAYLIST ------------------");
		ArrayList<String> listaNome = new ArrayList<>();
		listaNome.add("EducaCiencia FastCode"); // posicao 0 na Lista
		listaNome.add("CobraDev"); // posicao 1 na lista
		System.out.println("Lista Atual: " + Arrays.toString(listaNome.toArray()));
		System.out.println(" *****  Quantidade de dados na lista ******");
		System.out.println("Quantidade de dados: " + listaNome.size());
	}

	/* Verificando se contem determinado dado na Lista */
	public static void BuscaDeterminadoDadoLista() {
		System.out.println("----------- EDUCACIENCIA FASTCODE - ARRAYLIST ------------------");
		ArrayList<String> listaNome = new ArrayList<>();
		listaNome.add("EducaCiencia FastCode"); // posicao 0 na Lista
		listaNome.add("CobraDev"); // posicao 1 na lista
		System.out.println("Lista Atual: " + Arrays.toString(listaNome.toArray()));
		System.out.println(" *****  Busca de dados na lista ******");
		String busca = "CobraDev";
		System.out.println("Verificando se existe " + busca);
		System.out.println("Busca por de dados: " + listaNome.contains(busca));
	}

	/* Ordenando dado na Lista */
	public static void ordenaDadoLista() {
		System.out.println("----------- EDUCACIENCIA FASTCODE - ARRAYLIST ------------------");
		ArrayList<String> listaNome = new ArrayList<>();
		listaNome.add("EducaCiencia FastCode"); // posicao 0 na Lista
		listaNome.add("CobraDev"); // posicao 1 na lista
		System.out.println("Lista Atual: " + Arrays.toString(listaNome.toArray()));
		System.out.println(" *****  Ordenando dados na lista ******");
		Collections.sort(listaNome);
		System.out.println("Lista Ordenada: " + listaNome.toString());

	}

/* ***************************************************************************** */

	/* Criando agenda de telefone */
	public static void AgendaTelefone() {
		try (Scanner captura = new Scanner(System.in)) {
			// Instanciando uma agenda de contatos
			ArrayList<String> agenda = new ArrayList<String>();

			// adicionando 4 contatos na agenda
			agenda.add("Fabio Perucello ; 11 1111-1111");
			agenda.add("Thiago Fratucci; 22 2222-2222");
			agenda.add("Marcelo Lazaro; 33 3333-3333");
			agenda.add("Faruk Kalil; 44 4444-4444");

			// declarando "i"
			int i;

			System.out.printf("Percorrendo o ArrayList (usando o índice)\n");

			// número de elementos da agenda: método size()
			int n = agenda.size();

			// Listando os contatos da agenda (usando o índice)
			for (i = 0; i < n; i++) {
				System.out.printf("Posição %d - %s\n", i, agenda.get(i));
			}

			// Excluindo posição de acordo com a informada
			System.out.printf("\nInforme a posição a ser removida: ");
			i = captura.nextInt();
			System.out.println("Excluindo... " + i + " - " + agenda.get(i) + "\n");

			try {
				// Removendo contato da agenda
				agenda.remove(i);
			} catch (IndexOutOfBoundsException e) {

				// exceção lançada para indicar que um índice (i) , se está fora do intervalo
				// válido (de 0 até agenda.size()-1)
				System.out.printf("\nErro: posição inválida (%s).", e.getMessage());
			}

			System.out.printf("\nPercorrendo o ArrayList (for-each)\n");
			// Exibe contatos da agenda (for-each)
			i = 0;
			for (String contato : agenda) {
				System.out.printf("Posição %d - %s \n", i, contato);
				i++;
			}

			System.out.printf("\nPercorrendo o ArrayList (iterator)\n");
			// Exibindo contatos da agenda (iterator)
			i = 0;
			Iterator<String> iterator = agenda.iterator();
			while (iterator.hasNext()) {
				System.out.printf("Posição %d - %s \n", i, iterator.next());
				i++;
			}
		}
	}
}