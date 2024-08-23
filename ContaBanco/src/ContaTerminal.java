import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		
		Scanner dado = new Scanner(System.in);
		int numero;
		String agencia, nomeCliente;
		double saldo;
		
		System.out.println("Bem Vindo!");
		System.out.println("\nPara realizar seu cadastro, preciso de algumas informações");
		
		System.out.println("\nPor favor, digite seu Nome: ");
		nomeCliente = dado.next();
		System.out.println("Digite o Numero da Conta: ");
		numero = dado.nextInt();
		System.out.println("Digite o Numero da Agencia: ");
		agencia = dado.next();
		System.out.println("Digite o Valor que sera depositado: ");
		saldo = dado.nextDouble();
		
		dado.close();
		
		System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
		System.out.println("Sua Agencia é: " + agencia + ", Numero da Conta: " + numero
				+ " e seu Saldo de R$ " + saldo + " já esta disponivel para saque.");

	}

}
