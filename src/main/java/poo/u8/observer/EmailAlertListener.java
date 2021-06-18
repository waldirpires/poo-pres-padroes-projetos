package poo.u8.observer;

public class EmailAlertListener implements EventListener{

	private String email;
	private String mensagem;
	
	public EmailAlertListener(String email, String mensagem) {
		this.email = email;
		this.mensagem = mensagem;
	}
	
	@Override
	public void update(String nomeArquivo) {
		System.out.println("Email to " + email + ": " + mensagem + " - arquivo: " + nomeArquivo);		
	}

}
