package poo.u8.command;

public class ComandoCortar extends ComandoImpl {

	public ComandoCortar(Aplicacao app, Editor editor) {
		super(app, editor);
	}

	@Override
	public boolean executar() {
		salvarBackup();
		app.setAreaDeTransferencia(editor.getSelecao());
		editor.removerSelecao();
		
		return true;
	}

}
