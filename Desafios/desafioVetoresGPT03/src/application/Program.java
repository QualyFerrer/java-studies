package application;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();

		int numeroBusca;
		int contador = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			list.add(sc.nextInt());
		}
		
		System.out.print("\nDigite um número que deseja buscar: ");
			numeroBusca = sc.nextInt();
			
			System.out.println("Posição do número buscado: ");
			for(int i = 0; i<list.size(); i++) {
				if(list.get(i) == numeroBusca) {
					System.out.print(i + " ");
					contador ++;
				}
			}
			System.out.println("\nLista completa: ");
			for(int num : list) {
				System.out.print(num + " ");
			}
			
			if(contador == 0) {
			System.out.println("\nNumero não encontrado");
			}
			else {
				System.out.println("\nNumero " + numeroBusca + " encontrado " + contador + " vezes.");
			}
	}
		

}
