package estudos;

import java.util.Scanner;

public class voltando {
	public static void main(String[] args) {
		// program that ask the user one number and veja se ele é par ou impar

		Fazernovamente();
		Continuarounao();
	}

	public static void Fazernovamente() {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("digite um numero");
		num = sc.nextInt();
		System.out.println(num);
		if (num % 2 == 0) {
			System.out.println("O " + num + " é par");
		} else {
			System.out.println("O " + num + " não é par");
		}
	}

	public static void Continuarounao() {
	   int answer=0;	
		while(answer != 2) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Quer fazer outro? Digite 1 para refazer e 2 para sair");
			answer = sc.nextInt();// trim remove whitespaces
			if (answer == 1) {
				Fazernovamente();
			} else {
				System.out.println("Até mais!");
			}
		}

	}
}