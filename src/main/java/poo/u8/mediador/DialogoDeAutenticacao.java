package poo.u8.mediador;

// 3 mediador do sistema
public class DialogoDeAutenticacao implements Mediador{

	private String titulo;
	private Checkbox loginOuRegistrar;
	private CaixaDeTexto usuario;
	private CaixaDeTexto senha;

	private CaixaDeTexto regUsuario;
	private CaixaDeTexto regSenha;
	private CaixaDeTexto regEmail;
	private Botao ok;
	private Botao cancelar;
	
	public DialogoDeAutenticacao(String titulo) {
		this.titulo = titulo;
		
		// fábrica, construção de objetos
		loginOuRegistrar = new Checkbox(this);
		usuario = new CaixaDeTexto(this);
		senha =  new CaixaDeTexto(this);
		regUsuario =  new CaixaDeTexto(this);
		regSenha =  new CaixaDeTexto(this);
		regEmail =  new CaixaDeTexto(this);
		ok = new Botao(this);
		cancelar = new Botao(this);
	}
	
	public Checkbox getLoginOuRegistrar() {
		return loginOuRegistrar;
	}
	
	public Botao getOk() {
		return ok;
	}
	
	@Override
	public void notificar(Componente enviador, String evento) {
		if (enviador.equals(loginOuRegistrar) && evento.equals("check")) {
			if (loginOuRegistrar.isCheck()) {
				titulo = "login";
				
			} else {
				titulo = "Registrar";
			}
		}
		
		if (enviador.equals(ok) && evento.equals("click")) {
			if (loginOuRegistrar.isCheck()) {
				System.out.println("Realizar login do usuario");
			} else {
				System.out.println("Criando uma nova conta com os dados");
			}
		}		
	}

	public String getTitulo() {
		return titulo;
	}

	public CaixaDeTexto getUsuario() {
		return usuario;
	}

	public CaixaDeTexto getSenha() {
		return senha;
	}

	public CaixaDeTexto getRegUsuario() {
		return regUsuario;
	}

	public CaixaDeTexto getRegSenha() {
		return regSenha;
	}

	public CaixaDeTexto getRegEmail() {
		return regEmail;
	}

	public Botao getCancelar() {
		return cancelar;
	}
	
	

}
