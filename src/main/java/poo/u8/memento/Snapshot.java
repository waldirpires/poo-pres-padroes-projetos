package poo.u8.memento;

// (2) fornece o memento (cópia histórica do objeto)
public class Snapshot implements Memento{

	private EditorDeTexto editor;
	
	// histórico, imutável
	private String texto;
	private int posicaoCursor;
	private String selecao;
	
	public Snapshot(EditorDeTexto editor, String texto, int posicaoCursor, String selecao) {
		this.editor = editor;
		this.texto = texto;
		this.posicaoCursor = posicaoCursor;
		this.selecao = selecao;
	}

	//  (6) executar a restauração
	public void restaurar() {
		editor.setTexto(texto);
		editor.setPosicaoCursor(posicaoCursor);
		editor.setSelecao(selecao);
	}
}
