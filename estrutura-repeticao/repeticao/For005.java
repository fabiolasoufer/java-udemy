package estrutura.repeticao;

import java.util.Scanner;

public class For005 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int fat=1;
		
		for(int x=1; x<=n; x++) {
			fat = fat * x;			
		}
		
		System.out.println(fat);
		
		sc.close();

	}

}
