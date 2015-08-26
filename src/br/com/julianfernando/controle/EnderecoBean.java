package br.com.julianfernando.controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.julianfernando.modelo.Endereco;

@ManagedBean
@ApplicationScoped 
public class EnderecoBean {
	
	private Endereco endereco = new Endereco(1L);
	
	private List<Endereco> enderecos = new ArrayList<Endereco>();

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void adicionar() {
		this.enderecos.add(endereco);
		Long codigo = Math.incrementExact(this.endereco.getCodigo());
		this.endereco = new Endereco(codigo);
	}
	
}
