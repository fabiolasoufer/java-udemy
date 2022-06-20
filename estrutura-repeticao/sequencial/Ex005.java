package estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double total = 0;
		
		int p1 = sc.nextInt();
		int number1 = sc.nextInt();
		double value1 = sc.nextDouble();
		
		int p2 = sc.nextInt();
		int number2 = sc.nextInt();
		double value2 = sc.nextDouble();
		
		total = number1 * value1 + number2 * value2;
		System.out.printf("VALOR A PAGAR: R$ %.2f ", total);
		
		sc.close();

	}

}
