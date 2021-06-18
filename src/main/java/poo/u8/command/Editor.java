package poo.u8.command;

// receptor do padrão command
public class Editor {

	private String texto;
	
	private String selecao;
	
	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String getSelecao() {
		return selecao;
	}
	
	public void setSelecao(String selecao) {
		this.selecao = selecao;
	}
	
	public void removerSelecao() { // ctrl+x
		this.texto = this.texto.replace(selecao, "");
	}
	
	public void adicionarSelecao() { // ctrl+c
		this.texto = this.texto + selecao;
	}
}
