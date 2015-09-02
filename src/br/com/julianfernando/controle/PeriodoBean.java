package br.com.julianfernando.controle;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.julianfernando.modelo.Periodo;

@ManagedBean
@ApplicationScoped
public class PeriodoBean {

	private Periodo periodo = new Periodo();

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}
	
	public void enviar() {
		this.periodo = new Periodo();
	}
}
