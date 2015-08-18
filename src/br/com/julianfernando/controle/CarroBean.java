package br.com.julianfernando.controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.julianfernando.modelo.Carro;

@ManagedBean
@ApplicationScoped
public class CarroBean {

	private Carro carro = new Carro();
	
	private List<Carro> carros = new ArrayList<Carro>();
	
	public Carro getCarro() {
		return carro;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	public void adicionaCarro() {
		
		this.carros.add(getCarro());
		
		this.carro = new Carro();
	}
}
