package br.com.julianfernando.modelo;

import java.util.Date;

public class Funcionario {
	
	private Long codigo;
	
	private Long codigoHidden = 1L;
	
	private Double salario;
	
	private Date aniversario;
	
	public Funcionario(Long codigo) {
		super();
		this.setCodigo(codigo);
	}
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Date getAniversario() {
		return aniversario;
	}

	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}

	public Long getCodigoHidden() {
		return codigoHidden;
	}

	public void setCodigoHidden(Long codigoHidden) {
		this.codigoHidden = codigoHidden;
	}
}
