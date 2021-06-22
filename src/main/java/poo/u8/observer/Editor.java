package poo.u8.observer;

// quem publica
public class Editor {
	
	// gerencia publicação e subscrita de eventos
	private EventManager eventos;
	
	private Arquivo arquivo;
	
	public Editor() {
		this.eventos = new EventManager();
	}
	
	// operação sendo realizada
	public void abrirArquivo(String nome) {
		this.arquivo = new Arquivo(nome);
		
		// notificando a operação ocorrida
		eventos.notificar("open", nome);
	}
	
	// operação sendo realizada
	public void salvarArquivo() {
		this.arquivo.write("conteudo");
		
		eventos.notificar("save", this.arquivo.getNome());
	}
	
	public EventManager getEventos() {
		return eventos;
	}

}
