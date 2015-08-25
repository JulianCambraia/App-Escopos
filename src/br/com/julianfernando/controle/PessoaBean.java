package br.com.julianfernando.controle;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.julianfernando.modelo.Pessoa;

@ManagedBean
@ApplicationScoped
public class PessoaBean {

	private Pessoa pessoa = new Pessoa();
	
	private Map<String, String> sexos = new LinkedHashMap<String, String>();
	
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();

	public PessoaBean() {
		super();
		this.sexos.put("M", "Masculino");
		this.sexos.put("F", "Feminino");
		this.sexos.put("O", "Outros");
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Map<String, String> getSexos() {
		return sexos;
	}

	public void setSexos(Map<String, String> sexos) {
		this.sexos = sexos;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	
	public void adicionar() {
		//this.pessoa.setSexo(this.sexos.get(pessoa.getSexo()));
		this.pessoas.add(pessoa);
		
		this.pessoa = new Pessoa();
	}
}
