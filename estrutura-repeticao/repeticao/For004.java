package estrutura.repeticao;

import java.util.Scanner;

public class For004 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			int number1 = sc.nextInt();
			int number2 = sc.nextInt();
			
			if (number2 == 0) {
				System.out.println("Divisão impossível!");
			}
			else {
				double div = (double) number1 / number2;
				System.out.printf("%.1f%n",div);
			}
		}
		
		sc.close();

	}

}
