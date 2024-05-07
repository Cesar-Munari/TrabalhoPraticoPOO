package faculdade;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int opcao;
		
		// Instancia o cofrinho de moedas
		Cofrinho cofrinho = new Cofrinho();
		
		// Imprime o menu de interação com o usuário e armazena a opção do usuário na variável opcao.

		System.out.println("Menu");
		System.out.println("1-Adicionar");
		System.out.println("2-Remover");
		System.out.println("3-Listar");
		System.out.println("4-Imprimir valor total");
		System.out.println("0-Encerrar");
		System.out.println("");
		opcao=teclado.nextInt();
		
		int tipoMoeda;
		double valor;
		Moeda m;
		
		// Loop que só encerra o programa quando o usuário inserir a opção 0
		while(opcao!=0) {
			
			switch(opcao) {
			
			// Caso o usuário escolha adicionar moeda
			case 1:
				tipoMoeda=0;
				// Enquanto não for inserido um tipo de moeda válido, o programa continua solicitando o tipo de moeda
				while(tipoMoeda>3 || tipoMoeda<=0) {
					System.out.println("1-Real");
					System.out.println("2-Dolar");
					System.out.println("3-Euro");
					tipoMoeda = teclado.nextInt();
				}
				
				// Pergunta ao usuário o valor da moeda e o armazena no atributo valor
				System.out.println("Valor?");
				valor = teclado.nextDouble();
				
				// Seleciona qual o tipo de moeda a ser instanciado conforme selecionado pelo usuário
				m = null;
				if(tipoMoeda==1) {
					m = new Real(valor);
				}
				else if(tipoMoeda==2) {
					m = new Dolar(valor);
				}
				else {
					m = new Euro(valor);
				}
				
				// Adiciona a nova moeda no cofrinho
				cofrinho.adicionar(m);
				
				break;
			
			// Caso o usuário escolha remover moeda
			case 2:
				// Enquanto não for inserido um tipo de moeda válido, o programa continua solicitando o tipo de moeda
				tipoMoeda=0;
				while(tipoMoeda>3 || tipoMoeda<=0) {
					System.out.println("1-Real");
					System.out.println("2-Dolar");
					System.out.println("3-Euro");
					tipoMoeda = teclado.nextInt();
				}
				
				// Pergunta ao usuário o valor da moeda e o armazena no atributo valor
				System.out.println("Valor?");
				valor = teclado.nextDouble();
				
				// Seleciona qual o tipo de moeda a ser instanciado conforme selecionado pelo usuário
				m = null;
				if(tipoMoeda==1) {
					m = new Real(valor);
				}
				else if(tipoMoeda==2) {
					m = new Dolar(valor);
				}
				else {
					m = new Euro(valor);
				}
				
				// Remove a moeda do cofrinho
				cofrinho.remover(m);
				
				break;
			
			// Caso o usuário escolha listar as moedas do cofrinho
			case 3:
				// Chama o método listar(), que imprime a lista de moedas do cofrinho
				cofrinho.listar();
				break;
				
			// Caso o usuário escolha imprimir o valor total de moedas do cofrinho convertido em real
			case 4:
				// Chama o método total(), que calcula e imprime o valor total das moedas do cofrinho convertido em real
				cofrinho.total();
				break;
				
			// Caso o usuário tente inserir alguma opção diferente das apresentadas no menu de interação
			default:
				// Imprime a mensagem "Opcao Invalida!"
				System.out.println("Opcao Invalida!");
			}
			
			// Imprime o menu de interação a cada operação realizada enquanto o programa não for encerrado
			System.out.println("");
			System.out.println("Menu");
			System.out.println("1-Adicionar");
			System.out.println("2-Remover");
			System.out.println("3-Listar");
			System.out.println("4-Imprimir valor total");
			System.out.println("0-Encerrar");
			System.out.println("");
			opcao=teclado.nextInt();
		}
	}

}
