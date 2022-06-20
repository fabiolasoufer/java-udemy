package estrutura.repeticao;

import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código do combustível que deseja abastecer:"
				+ "\n [1] Álcool"
				+ "\n [2] Gasolina"
				+ "\n [3] Diesel"
				+ "\n [4] FIM");
		int codigo = sc.nextInt();
		int alcool=0, gasolina=0, diesel=0;
		
		while (codigo != 4) {
			
			if (codigo == 1) {
				alcool = alcool + 1;
			}
			else if (codigo == 2) {
				gasolina = gasolina + 1;
			}
			else if (codigo == 3) {
				diesel = diesel + 1;
			}
			
			codigo = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Álcool: "+alcool);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Diesel: "+diesel);
		
		sc.close();

	}

}
