package br.com.julianfernando.modelo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Endereco {
	
	private Long codigo;
	
	@NotNull(message="{br.com.julianfernando.Endereco.descricao}")
	private String descricao;
	
	@NotNull(message="{br.com.julianfernando.Endereco.numero}")
	private String numero;
	
	@NotNull(message="{br.com.julianfernando.Endereco.cep}")
	@Pattern(regexp="[0-9]{2}\\.[0-9]{3}\\-[0-9]{3}",message="{javax.validation.constraints.Pattern.message}" )
	private String cep;
	
	@NotNull(message="{br.com.julianfernando.Endereco.complemento}")
	private String complemento;

	
	public Endereco(Long codigo) {
		super();
		this.setCodigo(codigo);
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}
