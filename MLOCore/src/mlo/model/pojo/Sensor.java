package mlo.model.pojo;

import java.util.ArrayList;

public class Sensor extends BasePOJO {
	private String nome;
	private String descricao;
	private int sensorPorta;
	private String tipoSensor;
	private ArrayList<OcorrenciaVazamento> ocorrenciaVazamento = new ArrayList<OcorrenciaVazamento>();
	private ArrayList<MedicaoVolume> medicaoVolumes = new ArrayList<MedicaoVolume>();

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setSensorPorta(int sensorPorta) {
		this.sensorPorta = sensorPorta;
	}

	public int getSensorPorta() {
		return this.sensorPorta;
	}

	public void setTipoSensor(String tipoSensor) {
		this.tipoSensor = tipoSensor;
	}

	public String getTipoSensor() {
		return this.tipoSensor;
	}
}