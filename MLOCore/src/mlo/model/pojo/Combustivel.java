package mlo.model.pojo;

import java.util.ArrayList;

public class Combustivel extends BasePOJO {
	private String combustivelDescricao;
	private ArrayList<Tanque> tanque = new ArrayList<Tanque>();

	public void setCombustivelDescricao(String combustivelDescricao) {
		this.combustivelDescricao = combustivelDescricao;
	}

	public String getCombustivelDescricao() {
		return this.combustivelDescricao;
	}
}