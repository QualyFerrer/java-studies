package application;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();

		int contador = 0;
		int numeroBusca;

		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			list.add(sc.nextInt());
		}

		boolean valorEncontrado = true;
		while (!valorEncontrado) {
			System.out.print("Digite um número para buscar: ");
			numeroBusca = sc.nextInt();

			System.out.println("\nPosição do número digitado: ");
			for (int i = 0; i < list.size(); i++) {
				if (numeroBusca == list.get(i)) {
					System.out.print(i + " ");
					contador++;
				}
			}
			System.out.println("\nValores digitados: ");
			for (int num : list) {
				System.out.print(num + " ");
			}

			if (contador == 0) {
				System.out.println("\nValor não encontrador");
				continue;
			} else {
				System.out.println("\nNúmero " + numeroBusca + " aparece " + contador + " vezes");
			}

			int vMenor = list.get(0);
			int vMaior = list.get(0);

			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) > vMaior) {
					vMaior = list.get(i);
				}
				if (list.get(i) <= vMenor) {
					vMenor = list.get(i);
				}
			}

			System.out.println("\nMaior valor: " + vMaior);

			System.out.println("\nMenor valor: " + vMenor);

			double sum = 0;

			for (int n : list) {
				sum += n;
			}
			double avg = sum / list.size();

			System.out.println("Valor total: " + sum);
			System.out.println("Valor médio: " + avg);

		}
	}
}
