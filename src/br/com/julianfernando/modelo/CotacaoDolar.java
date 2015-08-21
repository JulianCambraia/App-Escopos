package br.com.julianfernando.modelo;

import java.util.Date;

public class CotacaoDolar {
	
	private Double valor;
	
	private Float porcentagem;
	
	private Date dataHoraCotacao;

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Float getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(Float porcentagem) {
		this.porcentagem = porcentagem;
	}

	public Date getDataHoraCotacao() {
		return dataHoraCotacao;
	}

	public void setDataHoraCotacao(Date dataHoraCotacao) {
		this.dataHoraCotacao = dataHoraCotacao;
	}
	
}
