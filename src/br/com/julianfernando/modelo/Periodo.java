package br.com.julianfernando.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Periodo {

	private Date dataInicial;
	
	private Date dataFinal;
	
	private Date dataInscricao;

	public Periodo() {
		super();
		try {
			this.dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2015");
			
			Date now = new Date();
			
			this.dataFinal = now;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public Date getDataInscricao() {
		return dataInscricao;
	}

	public void setDataInscricao(Date dataInscricao) {
		this.dataInscricao = dataInscricao;
	}
}
