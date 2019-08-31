package mlo.model.pojo;

public class Turno extends BasePOJO {
	private String horaInicio;
	private String horaFim;
	private String dataModificacao;

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraFim(String horaFim) {
		this.horaFim = horaFim;
	}

	public String getHoraFim() {
		return this.horaFim;
	}

	public void setDataModificacao(String dataModificacao) {
		this.dataModificacao = dataModificacao;
	}

	public String getDataModificacao() {
		return this.dataModificacao;
	}
}