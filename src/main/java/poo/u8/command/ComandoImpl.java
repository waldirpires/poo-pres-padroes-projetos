package poo.u8.command;

public abstract class ComandoImpl implements Comando {
	
	protected Aplicacao app;
	protected Editor editor;
	private String backup;

	public ComandoImpl(Aplicacao app, Editor editor) {
		this.app = app;
		this.editor = editor;
	}

	public void salvarBackup() {
		backup = editor.getTexto();
	}
	
	public void desfazer() {
		editor.setTexto(backup);
	}
	
}
