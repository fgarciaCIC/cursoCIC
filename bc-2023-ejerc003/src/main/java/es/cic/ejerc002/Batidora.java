package es.cic.ejerc002;

public class Batidora {
	
	private double tiempoTotalDeLaReceta;
	private double minutosRestantes;
	
	/* Comentario de pruebas 2*/
	
	private ICalculadora objCalculadora;
	
	public double calcularTiempoTotalDeReceta(double minuto1, double minuto2) {
		this.objCalculadora.reset();
		
		this.objCalculadora.sumar(minuto1);
		this.objCalculadora.sumar(minuto2);
		
		tiempoTotalDeLaReceta = getObjCalculadora().getResultado();
		
		return tiempoTotalDeLaReceta;
		
	}
	
	/**
	 * 
	 * Método para calcular cuánto tiempo falta para completar la receta
	 * 
	 */
	public double calcularMinutosRestantes(double minutosPasados) {
		this.objCalculadora.reset();
		this.objCalculadora.sumar(tiempoTotalDeLaReceta);
		this.objCalculadora.restar(minutosPasados);
		minutosRestantes = objCalculadora.getResultado();
		
		return minutosRestantes;
	}
	
	public double getTotalMinutos() {
		return tiempoTotalDeLaReceta;
	}
	
	public double getMinutosRestantes() {
		return minutosRestantes;
	}

	public ICalculadora getObjCalculadora() {
		return objCalculadora;
	}

	public void setObjCalculadora(ICalculadora objCalculadora) {
		this.objCalculadora = objCalculadora;
	}

}
