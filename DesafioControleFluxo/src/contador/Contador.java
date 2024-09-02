package contador;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		int parametroUm, parametroDois;
		
		try {
			System.out.println("Digite o primeiro parametro:");
			parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parametro:");
			parametroDois = terminal.nextInt();
		
			contar(parametroUm, parametroDois);
		} catch(InputMismatchException e) {
			System.out.println("Apenas numeros inteiros!");
		} catch(ParametrosInvalidosException e) {
			System.out.println(e);
		}
		
		terminal.close();
	}	
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if(parametroDois<parametroUm) {
			throw new ParametrosInvalidosException();
		}
		int contagem = parametroDois - parametroUm;
		for (int c=1;c < contagem+1; c++) 
			System.out.println("Imprimindo o numero "+c);	
	}

}