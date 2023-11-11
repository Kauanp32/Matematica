package Matematica;


import java.util.Scanner;

public class Adicao implements Operacao {
	Scanner sc = new Scanner(System.in);

	@Override
	public double calcular(double num1, double num2) {
		System.out.println("Digite o primeiro numero da Adição: ");
		num1 = sc.nextDouble();
		System.out.println("Digite o segundo numero da Adição: ");
		num2 = sc.nextDouble();
		
		return num1 + num2;
	}

}
