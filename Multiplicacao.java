package Matematica;

import java.util.Scanner;

public class Multiplicacao {
	Scanner sc = new Scanner(System.in);

	public double calcular(double num1, double num2) {
		
		System.out.println("Digite o primeiro numero da Multiplicação: ");
		num1 = sc.nextDouble();
		System.out.println("Digite o segundo numero da Multiplicação: ");
		num2 = sc.nextDouble();
		return num1 * num2;
	}

}
