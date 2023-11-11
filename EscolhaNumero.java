package Matematica;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EscolhaNumero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double numero1;
		double numero2;
		String escolha =
				JOptionPane.showInputDialog(null,
				"###### Seja bem vindo ao conversor ######### \n escolha uma opção:"
				+ "\n 1 - pontenciação "
				+ "\n 2 - maior numero "
				+ "\n 3 - menor numero "
				+ "\n 4 - numero aleatorio ");
				
			switch (escolha) {
			
			case "1":
			
			numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro numero"));
			numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo numero"));
			
			JOptionPane.showInputDialog(null, "o resultado e: " + Math.pow(numero1, numero2));
			break;
			
			case "2":
			
			numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro numero"));
			numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo numero"));
			
			JOptionPane.showInputDialog(null, "o resultado e: " + Math.max(numero1, numero2));
			break;
			
			case "3":
			
			numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro numero"));
			numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo numero"));
			
			JOptionPane.showInputDialog(null, "o resultado e: " + Math.min(numero1, numero2));
			break;
			
			case "4":
			
			numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro numero"));
			numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo numero"));
			
			JOptionPane.showInputDialog(null, "o resultado e: " + Math.random()*(numero1)*10);
			break;
			
	 }
  }

}
