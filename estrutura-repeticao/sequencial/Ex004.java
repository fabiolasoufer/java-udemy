package estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salary;
		
		int number = sc.nextInt();
		double hours = sc.nextDouble();
		double value = sc.nextDouble();
		
		salary = hours * value;
		System.out.println("NUMBER = "+ number);
		System.out.printf("SALARY = U$ %.2f", salary);
		
		sc.close();		

	}

}
