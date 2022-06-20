package estrutura.condicional;

import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total=0;
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		if (start < end) {
			total = end - start;
		}
		
		else {
			total = 24 - start + end;
		}
		
		System.out.println("O jogo durou "+total+" hora(s)");
		
		sc.close();

	}

}
