package mlo.model.pojo;

public class MedicaoVolume extends BasePOJO {
	private String dataMedicao;
	private String horaMedicao;
	private Double volume;
	private Sensor sensor;

	public void setDataMedicao(String dataMedicao) {
		this.dataMedicao = dataMedicao;
	}

	public String getDataMedicao() {
		return this.dataMedicao;
	}

	public void setHoraMedicao(String horaMedicao) {
		this.horaMedicao = horaMedicao;
	}

	public String getHoraMedicao() {
		return this.horaMedicao;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public Double getVolume() {
		return this.volume;
	}
}