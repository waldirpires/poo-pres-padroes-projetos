package poo.u8.observer;

public class Editor {
	private EventManager eventos;
	private Arquivo arquivo;
	
	public Editor() {
		this.eventos = new EventManager();
	}
	
	public void abrirArquivo(String nome) {
		this.arquivo = new Arquivo(nome);
		
		eventos.notificar("open", nome);
	}
	
	public void salvarArquivo() {
		this.arquivo.write("conteudo");
		
		eventos.notificar("save", this.arquivo.getNome());
	}
	
	public EventManager getEventos() {
		return eventos;
	}

}
