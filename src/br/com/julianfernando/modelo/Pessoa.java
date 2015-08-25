package br.com.julianfernando.modelo;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Pessoa {
	@NotNull(message="Campo código é de preenchimento obrigatório.")
	@Pattern(regexp="^[A-Z]{1}+[A-Za-z0-9]{3,10}",message="Código deve conter no mínimo 4 dígitos sendo o primeiro uma letra maiúscula e os demais letras e números" )
	private String codigo;
	
	@NotNull(message="Campo nome é de preenchimento obrigatório.")
	@Pattern(regexp="[A-Za-z0-9À-ú\\s]+", message="Somente são aceitos letras e números.")
	private String nome;
	
	@NotNull(message="Campo sexo é de preenchimento obrigatório.")
	private String sexo;
	
	@Min(value=1, message="Idade menor do que um ano ou nula.")
	@Max(value=120, message="Idade superior a 120 anos ou nula.")
	private Integer idade;
	
	@NotNull(message="Campo cpf não pode ser nulo.")
	@Pattern(regexp="[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\-[0-9]{2}",message="CPF tamanho inválido.")
	private String cpf;
	
	@NotNull(message="Campo Data de nascimento preenchimento obrigatório.")
	private Date dataNascimento;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
