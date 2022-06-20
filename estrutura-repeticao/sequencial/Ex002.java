package estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double area, tt = 3.14159, raio, y = 2;
		
		raio = sc.nextDouble();		
		area = tt * Math.pow(raio, y);
		
		System.out.printf("A = %.4f", area);
		
		sc.close();
	}

}
