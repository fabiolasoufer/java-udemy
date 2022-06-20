package estrutura.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class For003 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double media = 0.0;
		
		for (double teste = 0.0; teste <= n; teste++) {
			double m1 = sc.nextDouble();
			double m2 = sc.nextDouble();
			double m3 = sc.nextDouble();
			
			media = m1*0.2 + m2*0.3 + m3*0.5;
			System.out.printf("%.1f%n",media);
		}
		
		sc.close();

	}

}
