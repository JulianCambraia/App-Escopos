package br.com.julianfernando.modelo;

public class RIC {
	
	private int identificador;
	
	private int verificador;

	public RIC() {
		super();
	}
	
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public int getVerificador() {
		return verificador;
	}

	public void setVerificador(int verificador) {
		this.verificador = verificador;
	}
}
