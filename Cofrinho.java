package faculdade;

import java.util.ArrayList;

public class Cofrinho {
	
	// Cria a lista de moedas no cofrinho
	ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	// Método que adiciona moedas no cofrinho
	public void adicionar(Moeda m) {
		listaMoedas.add(m);
	}
	
	// Método que remove moedas no cofrinho
	public void remover(Moeda m) {
		int a = listaMoedas.size();
		listaMoedas.remove(m);
		int b = listaMoedas.size();
		if (a == b) {
			System.out.println("Moeda não encontrada!");
		}
	}
	
	// Método que imprime uma lista de todas as moedas
	public void listar() {
		for (Moeda m: listaMoedas) {
			m.info();
		}
	}
	
	// Método que calcula e imprime o valor total das moedas do cofrinho convertido para real
	public void total() {
		double total = 0;
		for (int i=0; i < listaMoedas.size(); i++) {
			total += listaMoedas.get(i).converter(listaMoedas.get(i).valor);
		}
		System.out.println("Valor total: " + total);
	}
}
