package faculdade;

public class Dolar extends Moeda {
	
	// Construtor
	public Dolar(double valor) {
		super(valor);
	}
	
	// Método que imprime a moeda e o seu valor. Usado no método de listar as moedas do cofrinho.
	@Override
	void info() {
		System.out.println("Dolar: " + valor);
	}
	
	// Método que converte o valor da moeda para real. No caso do dólar, o método retorna o próprio valor multiplicado por 5.
	@Override
	double converter(double v) {
		return v*5;
	}
	
	// Implementação do método que compara dois objetos. Usado na função de remover uma moeda.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
	
}