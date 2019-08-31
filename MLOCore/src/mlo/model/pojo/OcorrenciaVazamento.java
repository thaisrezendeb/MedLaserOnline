package mlo.model.pojo;

public class OcorrenciaVazamento extends BasePOJO {
	private String dataOcorrencia;
	private String horaOcorrencia;
	private int ocorrencia;
	private Sensor sensor;

	public void setDataOcorrencia(String dataOcorrencia) {
		this.dataOcorrencia = dataOcorrencia;
	}

	public String getDataOcorrencia() {
		return this.dataOcorrencia;
	}

	public void setHoraOcorrencia(String horaOcorrencia) {
		this.horaOcorrencia = horaOcorrencia;
	}

	public String getHoraOcorrencia() {
		return this.horaOcorrencia;
	}

	public void setOcorrencia(int ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	public int getOcorrencia() {
		return this.ocorrencia;
	}
}