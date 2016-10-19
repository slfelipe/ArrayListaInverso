package exercicios;

import java.util.Scanner;

class Elemento {
	String valor;
	Elemento proximo;
}

public class ListaInverso {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insira uma Palavra: ");
		String entrada = in.next();
		String[] split = entrada.split("");
		Elemento head = new Elemento();
		for (int i = 0; i < split.length; i++) {
			if (head.valor == null) {
				head.valor = split[i];

			} else {
				adicionar(head, split[i]);
			}
		}
		System.out.println("A Palavra invertida fica: ");
		imprimir(head);
	}

	static void adicionar(Elemento head, String split) {
		if (head.proximo == null) {
			Elemento novo = new Elemento();
			novo.valor = split;
			head.proximo = novo;

		} else if (head.proximo != null) {
			adicionar(head.proximo, split);

		}
	}

	public static void imprimir(Elemento head) {

		if (head.proximo != null) {
			imprimir(head.proximo);
		}
		System.out.printf(head.valor + " ");
	}
}
