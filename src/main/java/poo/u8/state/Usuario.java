package poo.u8.state;

public class Usuario {

	private TipoUsuario tipo;

	public Usuario(TipoUsuario tipo) {
		super();
		this.tipo = tipo;
	}
	
	public TipoUsuario getTipo() {
		return tipo;
	}
}
