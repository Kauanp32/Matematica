package Matematica;

import java.util.Scanner;

public class Adicao {

    Scanner sc = new Scanner(System.in);

    public double calcular(double num1, double num2) {
        System.out.println("Digite o primeiro numero da Adição: ");
        num1 = sc.nextDouble();
        System.out.println("Digite o segundo numero da Adição: ");
        num2 = sc.nextDouble();

        return num1 + num2;
    }
        public static void main(String[] args) {
            Adicao adicao = new Adicao();
            double resultado = adicao.calcular(0, 0);
            System.out.println("Resultado da Adição: " + resultado);
        }
    
}
