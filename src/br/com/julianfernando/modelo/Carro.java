package br.com.julianfernando.modelo;

import java.util.Date;

public class Carro {
	
	private String marca;
	
	private String modelo;
	
	private Integer modeloAno;
	
	private Double valorSemImpostos;
	
	private Date dataLocacao;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getModeloAno() {
		return modeloAno;
	}

	public void setModeloAno(Integer modeloAno) {
		this.modeloAno = modeloAno;
	}

	public Double getValorSemImpostos() {
		return valorSemImpostos;
	}

	public void setValorSemImpostos(Double valorSemImpostos) {
		this.valorSemImpostos = valorSemImpostos;
	}

	public Date getDataLocacao() {
		return dataLocacao;
	}

	public void setDataLocacao(Date dataLocacao) {
		this.dataLocacao = dataLocacao;
	}

}
