package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		ArrayList<Integer> list = new ArrayList<>();

		int numeroBusca;
		int contador = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			list.add(sc.nextInt());
		}

		sc.nextLine();
		System.out.print("Digite um número que queira buscar: ");
		numeroBusca = sc.nextInt();

		System.out.print("Posições encontradas: ");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == numeroBusca) {
				System.out.print((i+1) + " ");
				contador ++;
				
			}
		}
		System.out.print("\nLista completa: ");
		for(int number : list) {
			System.out.print(number + " ");
		}
		
		if(contador == 0) {
			System.out.println("\nNúmero não encontrado: ");
		}
		else {
			System.out.println("\nNúmero " + numeroBusca + " encontrado " + contador + " vezes");
			
		}
		
	}
}
