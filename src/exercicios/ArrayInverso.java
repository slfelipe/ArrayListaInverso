package exercicios;
import java.util.Scanner;

public class ArrayInverso {
	public static void main(String[] args) {
		System.out.println("Insira uma Palavra: ");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String entrada = in.next();

		String[] split = entrada.split("");
		int contaSplit = 0;
		String[] inversa = new String[split.length];

		for (int i = split.length - 1; i >= 0; i--) {
			inversa[i] = split[contaSplit];

			contaSplit++;
		}
		System.out.println("A Palavra invertida fica: ");
		for (int j = 0; j < inversa.length; j++)

			System.out.print(inversa[j]);
	}

}
