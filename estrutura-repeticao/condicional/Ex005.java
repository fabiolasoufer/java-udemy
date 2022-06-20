package estrutura.condicional;

import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite o código do seu pedido:"
				+ "\n[1] Cachorro Quente"
				+ "\n[2] X-Salada"
				+ "\n[3] X-Bacon"
				+ "\n[4] Torrada Simples"
				+ "\n[5] Refrigerante");		
		int pedido = sc.nextInt();
				
		System.out.println("Digite a quantidade:");
		int qtde = sc.nextInt();

		double total;
		
		if (pedido == 1) {
			total = qtde * 4.0;			
		}
		
		else if (pedido == 2) {
			total = qtde * 4.5;			
		}
		
		else if (pedido == 3) {
			total = qtde * 5.0;
		}
		
		else if (pedido == 4) {
			total = qtde * 2.0;
		}
		
		else {
			total = qtde * 1.5;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();

	}

}
