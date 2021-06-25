package poo.u8.mediador;

public class MainMediador {

	public static void main(String[] args) {
		// criar o diálogo
		var dialogo = new DialogoDeAutenticacao("Entrar no sistema");
		
		// registrar usuário
		var ok = dialogo.getOk();
		
		// clicando no botao ok para registrar
		dialogo.getRegUsuario().setTexto("jose.pereira");
		dialogo.getRegSenha().setTexto("123456");
		dialogo.getRegEmail().setTexto("jose.pereira@gmail.com");
		
		dialogo.notificar(ok, "click");		
		
		// logar com usuário
		var check = dialogo.getLoginOuRegistrar();
		check.checar();
		
		dialogo.getUsuario().setTexto("jose.pereira");
		dialogo.getSenha().setTexto("123456");
		dialogo.notificar(ok, "click");
	}
}
