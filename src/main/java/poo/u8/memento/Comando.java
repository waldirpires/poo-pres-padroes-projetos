package poo.u8.memento;

// (7) cuidador, caretaker
public class Comando {

	private EditorDeTexto editor;
	private Snapshot backup;
	
	public Comando(EditorDeTexto editor) {
		this.editor = editor;
	}
	
	// realizar backup
	public void fazerBackup( ) {
		backup = editor.criarSnapShot();
	}
	
	// desfazer uma modificação
	public void desfazer() {
		if (backup != null) {
			backup.restaurar();
		}
	}
}
