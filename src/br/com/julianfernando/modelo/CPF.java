package br.com.julianfernando.modelo;

public class CPF {

	private int numeroIdentificador;
	
	private int primeiroNumeroVerificador;
	
	private int segundoNumeroVerificador;

	public CPF() {
		super();
	}
	
	public int getNumeroIdentificador() {
		return numeroIdentificador;
	}


	public void setNumeroIdentificador(int numeroIdentificador) {
		this.numeroIdentificador = numeroIdentificador;
	}

	public int getPrimeiroNumeroVerificador() {
		return primeiroNumeroVerificador;
	}

	public void setPrimeiroNumeroVerificador(int primeiroNumeroVerificador) {
		this.primeiroNumeroVerificador = primeiroNumeroVerificador;
	}

	public int getSegundoNumeroVerificador() {
		return segundoNumeroVerificador;
	}

	public void setSegundoNumeroVerificador(int segundoNumeroVerificador) {
		this.segundoNumeroVerificador = segundoNumeroVerificador;
	}

}
