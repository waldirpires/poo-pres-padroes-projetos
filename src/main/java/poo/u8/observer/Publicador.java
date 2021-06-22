package poo.u8.observer;

public interface Publicador {

	// publicação do evento
	public void notificar(String tipoEvento, String dados);

	// adicao de consumidores
	public void subscribe(String tipoEvento, EventListener listener) ;
	
	// remoção da assinatura de consumidores
	public void unsubscribe(String tipoEvento, EventListener listener);
	
}
