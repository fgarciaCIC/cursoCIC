package es.cic.ejerc002;

public interface ICalculadora {

	void sumar(double sumando);

	void restar(double substraendo);

	void multiplicar(double factor);

	void dividir(double divisor);

	double getResultado();

	void reset();

}