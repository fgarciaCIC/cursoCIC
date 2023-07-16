package es.cic.ejerc002;

public class Calculadora implements ICalculadora {
	
	private double resultado;
	

	@Override
	public void sumar(double sumando) {
		this.resultado += sumando;
	}
	
	@Override
	public void restar(double substraendo) {
		this.resultado -= substraendo;
	} 
	
	@Override
	public void multiplicar(double factor) {
		this.resultado *= factor;
	}
	
	@Override
	public void dividir(double divisor) {
		this.resultado /= divisor;
	}
	
	@Override
	public double getResultado() {
		return resultado;
	}

	@Override
	public void reset() {
		this.resultado = 0.0;
	}
	
}
