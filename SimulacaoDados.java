package Matematica;

import java.util.Random;

public class SimulacaoDados {
    public static void main(String[] args) {
        Random random = new Random();
        int total = 0;
        for (int i = 0; i < 3; i++) {
            int dado = random.nextInt(6) + 1;
            total += dado;
            System.out.println("Jogada " + (i+1) + ": " + dado);
        }
        System.out.println("Total: " + total);
    }
}