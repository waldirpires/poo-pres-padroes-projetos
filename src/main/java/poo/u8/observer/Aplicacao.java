package poo.u8.observer;

import sun.util.logging.resources.logging;

public class Aplicacao {

	private Editor editor;
	
	private EventListener logger;
	
	private EventListener emailAlert;
	
	public EventListener getLogger() {
		return logger;
	}
	
	public void config() {
		// quem publica
		editor = new Editor();
		
		
		// quem consome
		logger = new LoggingListener("log.txt", "Arquivo foi aberto");
		emailAlert = new EmailAlertListener("joao.pereira@gmail.com", "Arquivo foi salvo");
		
		// registro dos consumidores por eventos
		editor.getEventos().subscribe("open", logger);
		editor.getEventos().subscribe("save", emailAlert);
	}
	
	public Editor getEditor() {
		return editor;
	}
	
	public static void main(String[] args) {
		var app = new Aplicacao();
		app.config();
		
		var editor = app.getEditor();
		
		// abrir um arquivo para processamento
		editor.abrirArquivo("test.txt");
		
		// salvar o arquivo
		editor.salvarArquivo();
		
		// remover assinatura
		editor.getEventos().unsubscribe("open", app.getLogger());
	}
}
