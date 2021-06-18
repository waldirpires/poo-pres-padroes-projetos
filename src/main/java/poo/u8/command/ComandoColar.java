package poo.u8.command;

public class ComandoColar extends ComandoImpl {

	public ComandoColar(Aplicacao app, Editor editor) {
		super(app, editor);
	}

	@Override
	public boolean executar() {
		salvarBackup();
		editor.adicionarSelecao();
		
		return true;
	}

}
