package poo.u8.state;

public class Documento {

	private Estado estado;
	private Usuario usuario;
	
	public void renderizar() {
		if (usuario.getTipo().equals(TipoUsuario.ADMIN) || usuario.getTipo().equals(TipoUsuario.AUTOR)) {
			estado.renderizar();
		} else {
			System.out.println("Usuário não possui permissão para renderizar.\n\n");
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
		System.out.println("Mudando o estado de "+ estado + " para " + novoEstado);
		this.estado = novoEstado;
	}
}
