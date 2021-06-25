package poo.u8.memento;

// (1) objeto de origem
public class EditorDeTexto {

	private String texto;
	private int posicaoCursor;
	private String selecao;
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public void setPosicaoCursor(int posicaoCursor) {
		this.posicaoCursor = posicaoCursor;
	}
	
	public void setSelecao(String selecao) {
		this.selecao = selecao;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public int getPosicaoCursor() {
		return posicaoCursor;
	}
	
	public String getSelecao() {
		return selecao;
	}
	
	// (5) criacao de uam cópia do objeto de origem
	public Snapshot criarSnapShot() {
		return new Snapshot(this, texto, posicaoCursor, selecao);
	}

	@Override
	public String toString() {
		return "EditorDeTexto [texto=" + texto + ", posicaoCursor=" + posicaoCursor + ", selecao=" + selecao + "]";
	}
	
	
}
