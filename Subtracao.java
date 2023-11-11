package Matematica;

import java.util.Scanner;

public class Subtracao {

	Scanner sc = new Scanner(System.in);

	
	 public double calcular(double num1, double num2) {
		
		System.out.println("Digite o primeiro numero da Subtraçaõ: ");
		num1 = sc.nextDouble();
		
		System.out.println("Digite o segundo numero da Subtração: ");
		num2 = sc.nextDouble();
		return num1 - num2;
	}
	
	public static void main(String[] args) {
        Subtracao subtracao = new Subtracao();
        double resultado = subtracao.calcular(0, 0);
        System.out.println("Resultado da Subtração: " + resultado);

  }

}
