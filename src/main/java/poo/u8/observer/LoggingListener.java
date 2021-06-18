package poo.u8.observer;

public class LoggingListener implements EventListener{
	private Arquivo log;
	private String mensagem;
	
	public LoggingListener(String arquivo, String msg) {
		this.log = new Arquivo(arquivo);
		this.mensagem = msg;		
	}

	@Override
	public void update(String nomeArquivo) {
		log.write(mensagem);
	}
	
}
