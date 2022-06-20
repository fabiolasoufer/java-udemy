package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("ENTER WITH STUDENT DATA");
		System.out.println("Name: ");
		student.name = sc.nextLine();
		System.out.println("1° Nota: ");
		student.a = sc.nextDouble();
		System.out.println("2° Nota: ");
		student.b = sc.nextDouble();
		System.out.println("3° Nota: ");
		student.c = sc.nextDouble();
		
		System.out.println();
		System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
		
		if (student.finalGrade() < 60.00) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoint());
		}
		else {
			System.out.println("PASS");
		}
		
		
		sc.close();

	}

}
