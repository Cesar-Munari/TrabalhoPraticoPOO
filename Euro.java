package faculdade;

public class Euro extends Moeda {

	// Construtor
	public Euro(double valor) {
		super(valor);
	}
	
	// Método que imprime a moeda e o seu valor. Usado no método de listar as moedas do cofrinho.
	@Override
	void info() {
		System.out.println("Euro: " + valor);
	}
	
	// Método que converte o valor da moeda para real. No caso do euro, o método retorna o valor multiplicado por 5,50.
	@Override
	double converter(double v) {
		return v*5.5;
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