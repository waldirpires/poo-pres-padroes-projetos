package poo.u8.command;

public class ComandoCopiar extends ComandoImpl {

	public ComandoCopiar(Aplicacao app, Editor editor) {
		super(app, editor);
	}

	@Override
	public boolean executar() {
		salvarBackup();
		app.setAreaDeTransferencia(editor.getSelecao());
		
		return true;
	}

}
