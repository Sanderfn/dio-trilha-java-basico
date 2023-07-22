package ControleFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
			
			Scanner terminal = new Scanner (System.in);
			
			System.out.println("digite parâmetro 1: ");
	        int parametroUm = terminal.nextInt();
	        
	        System.out.println("digite parâmetro 2: ");
	        int parametroDois = terminal.nextInt();
			     
	        terminal.close();
	           
			try {
				
				contar(parametroUm, parametroDois);
			}
			
			catch(ParametrosInvalidosException e) {
				System.out.println("O valor do parametro 2 deve ser menor que do parametro 1");
			}
	}
	
		static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException	{
			if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
			}
		
			int contagem = parametroDois - parametroUm;
			int c = contagem;
			for(int i =1 ; i<=c ;i++) {
				System.out.println(i);
		}
	
}
}

				
		