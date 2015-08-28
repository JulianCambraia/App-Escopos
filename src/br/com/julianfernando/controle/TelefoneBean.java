package br.com.julianfernando.controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.julianfernando.modelo.Telefone;

@ManagedBean
@ApplicationScoped
public class TelefoneBean {
	
	private Telefone telefone = new Telefone();
	
	private List<Telefone> telefones = new ArrayList<Telefone>();

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}
	
	public void adicionar() {
		
		this.telefones.add(telefone);
		
		this.telefone = new Telefone();
	}
}
