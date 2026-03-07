package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Quantos produtos deseja cadastrar? ");
		int n = sc.nextInt();

		Product[] product = new Product[n];

		for (int i = 0; i < product.length; i++) {
			System.out.print("Produto n°" + (i+1) + ": ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Digite o preço: ");
			Double price = sc.nextDouble();

			product[i]= new Product(name, price);
		}
		double sum = 0;
		double vMaior = product[0].getPrice();
		double vMenor = product[0].getPrice();
		
		for (int i = 0; i < product.length; i++) {
			if(product[i].getPrice() > vMaior) {
				vMaior = product[i].getPrice();
			}
			if(product[i].getPrice() < vMenor) {
				vMenor = product[i].getPrice();
			}
			
			sum += product[i].getPrice();
		}
		
		Double avg = sum / product.length;
		
		
		System.out.println("\n--- Lista de Produtos ---");
        for (Product p : product) {
            System.out.println(p);
		
        }
		
        System.out.println("Preço médio: " + avg);
		System.out.println("Maior preço: " + vMaior);
		System.out.println("Menor preço: " + vMenor);
		
        System.out.print("\nDigite o nome do produto para buscar: ");
        sc.nextLine();
        String busca = sc.nextLine();

        boolean encontrado = false;

        for (Product p : product) {
            if (p.getName().equalsIgnoreCase(busca)) {
                System.out.println("\nProduto encontrado:");
                System.out.println(p);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("\nProduto não encontrado.");
        }

		sc.close();

	}

}
