package br.com.julianfernando.controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.julianfernando.modelo.CotacaoDolar;

@ViewScoped
@ManagedBean
public class CotacaoDolarBean {
	
	private CotacaoDolar cotacaoDolar = new CotacaoDolar();
	
	private List<CotacaoDolar> cotacaoDolars = new ArrayList<CotacaoDolar>();

	public CotacaoDolar getCotacaoDolar() {
		return cotacaoDolar;
	}

	public void setCotacaoDolar(CotacaoDolar cotacaoDolar) {
		this.cotacaoDolar = cotacaoDolar;
	}
	
	public void adicionar() {
		this.cotacaoDolars.add(cotacaoDolar);
		
		this.cotacaoDolar = new CotacaoDolar();
	}

	public List<CotacaoDolar> getCotacaoDolars() {
		return cotacaoDolars;
	}
}
