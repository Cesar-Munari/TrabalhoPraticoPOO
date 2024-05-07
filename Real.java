package faculdade;

public class Real extends Moeda {

	// Construtor
	public Real(double valor) {
		super(valor);
	}
	
	// Método que imprime a moeda e o seu valor. Usado no método de listar as moedas do cofrinho.
	@Override
	void info() {
		System.out.println("Real: " + valor);
	}
	
	// Método que converte o valor da moeda para real. No caso do real, o método retorna o próprio valor.
	@Override
	double converter(double v) {
		return v;
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