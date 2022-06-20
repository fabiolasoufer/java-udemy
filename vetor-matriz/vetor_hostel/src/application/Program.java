package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Hostel;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will you need? ");
		int n = sc.nextInt();
		
		Hostel[] vect = new Hostel[10];
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();			
			System.out.printf("Rent #%d:%n", i + 1);
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("E-mail: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			vect[room] = new Hostel(name, email, room);
			System.out.println();
		}
		
		for(int i = 0; i <= 9; i++) {
			if (vect[i] != null) {
				System.out.println("Busy rooms:");
				System.out.printf("%d: %s, %s%n", 
						vect[i].getRoom(), vect[i].getName(), vect[i].getEmail());
			}
			
		}
		
		sc.close();

	}

}
