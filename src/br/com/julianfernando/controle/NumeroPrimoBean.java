package br.com.julianfernando.controle;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.julianfernando.modelo.NumeroPrimo;

@ManagedBean
@ApplicationScoped
public class NumeroPrimoBean {

	NumeroPrimo numeroPrimo = new NumeroPrimo();

	public NumeroPrimo getNumeroPrimo() {
		return numeroPrimo;
	}

	public void setNumeroPrimo(NumeroPrimo numeroPrimo) {
		this.numeroPrimo = numeroPrimo;
	}
	
	public void enviar() {
		
		NumeroPrimo numeroPrimo = new NumeroPrimo();
	}
}
