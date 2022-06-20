package estrutura.condicional;

import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		if (number >= 0) {
			System.out.println("NÃO NEGATIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
		
		
		sc.close();

	}

}
