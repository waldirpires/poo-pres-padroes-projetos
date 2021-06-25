package poo.u8.state;

public class MainState {

	public static void main(String[] args) {
		// documento em moderação
		var documento = new Documento();
		
		var leitor = new Usuario(TipoUsuario.LEITOR);
		documento.setUsuario(leitor);
		
		documento.renderizar();
		documento.publicar();
		
		// com usuario admin
		var admin = new Usuario(TipoUsuario.ADMIN);
		documento.setUsuario(admin);
		
		documento.renderizar();
		documento.publicar();
	}

}
