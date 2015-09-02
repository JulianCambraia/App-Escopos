package br.com.julianfernando.controle;

import javax.faces.bean.ManagedBean;

import br.com.julianfernando.beanvalidators.Primo;

@ManagedBean
public class PrimoBean {
	// @Primo private Class instância
	@br.com.julianfernando.beanvalidators.Primo	
	private Primo primo;

	public Primo getPrimo() {
		return primo;
	}

	public void setPrimo(Primo primo) {
		this.primo = primo;
	}
}
