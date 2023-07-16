package es.cic.ejerc002;

public class CalculadoraFake implements ICalculadora {
	private double resultado;
	
	@Override
	public void sumar(double sumando) {
	}
	
	@Override
	public void restar(double substraendo) {
	} 
	
	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	@Override
	public void multiplicar(double factor) {
	}

	@Override
	public void dividir(double divisor) {
	}

	@Override
	public void reset() {
	}
}
