package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];// Cria o objeto com de posição 0 a 10 todos null.
		
		System.out.println("How many rooms will be rentend?");// imprime na tela. Prompt
		int n = sc.nextInt();
		
		for(int i = 1 ; i <= n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			/* 
			 *Estou intanciando o objeto, que vai apontar pra onde vai estar os dados dos Email e Nome.
			 *
			Rent rent = new Rent(name, email); 
			vect[roomNumber] = rent*/
			
			vect[roomNumber] = new  Rent(name, email);// Pode usar esse como opção.	
		}
		System.out.println();
		System.out.println("Busy rooms: ");
		
		for(int i = 0; i < 10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		sc.close();	
	}
}
