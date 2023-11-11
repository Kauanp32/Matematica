package Matematica;

public class ExercicioDado {

	public static void main(String[] args) {

		int soma = 0;
		
		for(int i  =0; i < 3; i++) {
			
			int resultado = (int) (Math.random() * 6) +1;
			
			System.out.println("Jogada" + (i+1)+ ":" +resultado);
			soma = soma + resultado;
		}
		 
		  System.out.println("resultado total: " +soma);
		  
	}
	
}