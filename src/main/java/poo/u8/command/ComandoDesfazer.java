package poo.u8.command;

public class ComandoDesfazer extends ComandoImpl {

	public ComandoDesfazer(Aplicacao app, Editor editor) {
		super(app, editor);
	}

	@Override
	public boolean executar() {
		app.desfazer();
		
		return false;
	}

}
