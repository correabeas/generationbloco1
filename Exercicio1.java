package praticadia8;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// leia 2 numeros inteiros 
		//o primeiro deve ser menor que o segundo 
		//se n for, exibir que o intervalo é invalido e 
		//sair do programa 
		//no intervalo mostrar os numeros que sao multiplos de 3 e 5
		
		
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2;
		
		
		System.out.println("Digite o número: ");
		
		numero1 = leia.nextInt();
		
		System.out.println("Digite um número maior que o anterior: ");
		numero2 = leia.nextInt();
		
		if (numero2 < numero1) {
					
		System.out.println("Esse intervalo é inválido!");		
		}
		
		else {
			for (int contador = numero1; contador <= numero2; contador++) {
	            if (contador % 3 == 0 && contador %5 ==0) {
	                System.out.println("O número " + contador + " é divisível por 3 e 5");     
	            }
	        }
		}
		
		
		
		
		
		//quem mostra o resto da divisão é a porcentagem.
		//numero %3
		
}
}
