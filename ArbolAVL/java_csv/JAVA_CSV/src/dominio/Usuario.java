package dominio;

public class Usuario {

	private String codigo;
	private String nombres;
	private String apellidos;
	private String correo;

	public Usuario(String codigo, String nombres, String apellidos,
			String correo) {
		setCodigo(codigo);
		setNombres(nombres);
		setApellidos(apellidos);
		setCorreo(correo);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
}
