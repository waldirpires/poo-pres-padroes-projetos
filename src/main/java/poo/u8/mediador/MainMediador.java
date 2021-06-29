package poo.u8.mediador;

public class MainMediador {

	public static void main(String[] args) {
		// criar o diálogo
		var dialogo = new DialogoDeAutenticacao("Entrar no sistema");

		// obtendo acesso aos componentes
		var ok = dialogo.getOk();
		var check = dialogo.getLoginOuRegistrar();
		
		// registrar usuário
		dialogo.getRegUsuario().setTexto("jose.pereira");
		dialogo.getRegSenha().setTexto("123456");
		dialogo.getRegEmail().setTexto("jose.pereira@gmail.com");
		
		// clicando no botao ok para registrar
		ok.clicar();		
		
		// logar com usuário
		check.checar();
		
		dialogo.getUsuario().setTexto("jose.pereira");
		dialogo.getSenha().setTexto("123456");
		
		ok.clicar();		
	}
}
