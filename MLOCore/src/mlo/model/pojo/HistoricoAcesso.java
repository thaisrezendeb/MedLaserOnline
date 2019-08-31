package mlo.model.pojo;

public class HistoricoAcesso extends BasePOJO {
	private String nomeUsuario;
	private String dataLogin;
	private String horaLogin;
	private String dataLogout;
	private String horaLogout;
	private Usuario usuario;

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getNomeUsuario() {
		return this.nomeUsuario;
	}

	public void setDataLogin(String dataLogin) {
		this.dataLogin = dataLogin;
	}

	public String getDataLogin() {
		return this.dataLogin;
	}

	public void setHoraLogin(String horaLogin) {
		this.horaLogin = horaLogin;
	}

	public String getHoraLogin() {
		return this.horaLogin;
	}

	public void setDataLogout(String dataLogout) {
		this.dataLogout = dataLogout;
	}

	public String getDataLogout() {
		return this.dataLogout;
	}

	public void setHoraLogout(String horaLogout) {
		this.horaLogout = horaLogout;
	}

	public String getHoraLogout() {
		return this.horaLogout;
	}
}