package estrutura.sequencial;

import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
		soma = valor1 + valor2;
		
		System.out.println("SOMA = "+soma);
		
		sc.close();

	}

}
