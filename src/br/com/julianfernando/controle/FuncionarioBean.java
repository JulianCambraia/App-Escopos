package br.com.julianfernando.controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.julianfernando.modelo.Funcionario;

@ManagedBean
@ApplicationScoped
public class FuncionarioBean {

	private Funcionario funcionario = new Funcionario(1L);
	
	private List<Funcionario> funcionarios = new ArrayList<Funcionario>();

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
	public void adicionar() {
		this.funcionarios.add(getFuncionario());
		Long codigo = Math.incrementExact(this.funcionario.getCodigo());
		this.funcionario = new Funcionario(codigo);
	}
}
