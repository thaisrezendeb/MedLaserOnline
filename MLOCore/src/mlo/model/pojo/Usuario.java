package mlo.model.pojo;

import java.util.ArrayList;

public class Usuario extends BasePOJO {
	private String login;
	private String senha;
	private String nome;
	private Long perfil;
	private Usuario administrador;
	private ArrayList<Posto> posto = new ArrayList<Posto>();

	public void setLogin(String login) {
		this.login = login;
	}

	public String getLogin() {
		return this.login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setPerfil(Long perfil) {
		this.perfil = perfil;
	}

	public Long getPerfil() {
		return this.perfil;
	}

	public void setAdministrador(Usuario administrador) {
		this.administrador = administrador;
	}

	public Usuario getAdministrador() {
		return this.administrador;
	}
}