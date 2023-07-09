package ContaTerminal;

import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {

	public static void main(String[] args) throws Exception 	{
		
		// TODO:Conhecer e importar a classe Scanner

        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        //Obter pela scanner os valores diigtados no terminal

        System.out.println("Digite o número de sua agência: ");
        String agencia =  scanner.next();

        System.out.println("digite o número de sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();
       
        System.out.println("Digite seu saldo");
        float saldo = scanner.nextFloat();
        	        	        
        //Exibir a mensagem criada
        
        System.out.println("Olá, " + nome + " " + sobrenome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo +" já disponível está disponível para saque.");
          
    }
}
