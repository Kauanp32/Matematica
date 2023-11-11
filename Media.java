 package Matematica;

public class Media {

	public static void main(String[] args) {
		
		double [] numeros = {1.00 , 8.4, 10.3, 9.6,7.5,4.5,9.2 };
		double soma = 0;
		
		for (int i = 0; i < 7; i++) {
			soma += numeros[i];
		}
		
		 double media = soma / 7;
		 
		 System.out.println(media);
	}

}