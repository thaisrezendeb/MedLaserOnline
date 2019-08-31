package mlo.model.pojo;

import java.util.ArrayList;

public class Posto extends BasePOJO {
	private String razaoSocial;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String municipio;
	private String estado;
	private String pais;
	private String telefone;
	private Long CNPJ;
	private String iE;
	private String usuarioFTP;
	private String senhaFTP;
	private ArrayList<Turno> turno = new ArrayList<Turno>();
	private ArrayList<Tanque> tanque = new ArrayList<Tanque>();

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getRazaoSocial() {
		return this.razaoSocial;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getLogradouro() {
		return this.logradouro;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getComplemento() {
		return this.complemento;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getBairro() {
		return this.bairro;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getMunicipio() {
		return this.municipio;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getPais() {
		return this.pais;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setCNPJ(Long CNPJ) {
		this.CNPJ = CNPJ;
	}

	public Long getCNPJ() {
		return this.CNPJ;
	}

	public void setIE(String iE) {
		this.iE = iE;
	}

	public String getIE() {
		return this.iE;
	}

	public void setUsuarioFTP(String usuarioFTP) {
		this.usuarioFTP = usuarioFTP;
	}

	public String getUsuarioFTP() {
		return this.usuarioFTP;
	}

	public void setSenhaFTP(String senhaFTP) {
		this.senhaFTP = senhaFTP;
	}

	public String getSenhaFTP() {
		return this.senhaFTP;
	}
}