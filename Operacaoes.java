package Matematica;

public class Operacaoes {
    
    public double adicao(double num1, double num2) {
        return num1 + num2;
    }

    public double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public double divisao(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Não é possível dividir por zero.");
            return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Operacaoes calculadora = new Operacaoes();

        double num1 = 5;
        double num2 = 2;

        System.out.println("Resultado da Adição: " + calculadora.adicao(num1, num2));
        System.out.println("Resultado da Subtração: " + calculadora.subtracao(num1, num2));
        System.out.println("Resultado da Multiplicação: " + calculadora.multiplicacao(num1, num2));
        System.out.println("Resultado da Divisão: " + calculadora.divisao(num1, num2));
    }
}
