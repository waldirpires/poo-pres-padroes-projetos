package poo.u8.state;

//(1) classe de contexto
public class Documento {

	// (4) atributo de estado
	private Estado estado = new EmModeracao(this);
	private Usuario usuario;
	
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void renderizar() {
		if (usuario.getTipo().equals(TipoUsuario.ADMIN) || usuario.getTipo().equals(TipoUsuario.AUTOR)) {
			estado.renderizar();
		} else {
			System.out.println("Usuário não possui permissão para renderizar o documento.\n\n");
		}
	}
	
	public void publicar() {
		if (usuario.getTipo().equals(TipoUsuario.ADMIN)) {
			mudarEstado(new Publicado(this));
		} else {
			mudarEstado(new EmModeracao(this));
		}
	}
	
	public void mudarEstado(Estado novoEstado) {
		System.out.println("Mudando o estado de "+ estado + " para " + novoEstado + "\n\n");
		this.estado = novoEstado;
	}
}
