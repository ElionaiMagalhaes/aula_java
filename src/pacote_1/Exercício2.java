// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
package pacote_1;


import java.util.Scanner;

public class Exercício2 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
	    
		if (N % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}

		sc.close();
	}

}
