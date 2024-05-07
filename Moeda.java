package faculdade;

public abstract class Moeda {
	
	double valor;
	
	// Construtor
	public Moeda(double valor) {
		super();
		this.valor = valor;
	}
	
	// Métodos abstratos que serão implementados nas sub-classes
	abstract void info();
	abstract double converter(double v);

	// Método que compara dois objetos. Usado na função de remover uma moeda.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	
	
}
