package mlo.model.pojo;

import java.util.ArrayList;

public class Tanque extends BasePOJO {
	private String nome;
	private Long diametro;
	private Long comprimento;
	private Long volumeMinimo;
	private Combustivel tipoCombustivel;
	private Combustivel combustivel;
	private ArrayList<Sensor> sensor = new ArrayList<Sensor>();

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setDiametro(Long diametro) {
		this.diametro = diametro;
	}

	public Long getDiametro() {
		return this.diametro;
	}

	public void setComprimento(Long comprimento) {
		this.comprimento = comprimento;
	}

	public Long getComprimento() {
		return this.comprimento;
	}

	public void setVolumeMinimo(Long volumeMinimo) {
		this.volumeMinimo = volumeMinimo;
	}

	public Long getVolumeMinimo() {
		return this.volumeMinimo;
	}

	public void setTipoCombustivel(Combustivel tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public Combustivel getTipoCombustivel() {
		return this.tipoCombustivel;
	}
}