package poo.u8.observer;

public class Aplicacao {

	private Editor editor;
	
	private EventListener logger;
	
	private EventListener emailAlert;
	
	public void config() {
		editor = new Editor();
		
		logger = new LoggingListener("log.txt", "Arquivo foi aberto");
		editor.getEventos().subscribe("open", logger);
		
		emailAlert = new EmailAlertListener("joao.pereira@gmail.com", "Arquivo foi salvo");
		editor.getEventos().subscribe("save", emailAlert);
	}
	
	public Editor getEditor() {
		return editor;
	}
	
	public static void main(String[] args) {
		var app = new Aplicacao();
		app.config();
		
		var editor = app.getEditor();
		
		editor.abrirArquivo("test.txt");
		
		editor.salvarArquivo();
	}
}
