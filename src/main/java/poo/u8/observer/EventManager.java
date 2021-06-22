package poo.u8.observer;

import java.util.HashMap;
import java.util.Map;

// associar eventos a ouvintes/listeners
public class EventManager implements Publicador{

	private Map<String, EventListener> listeners;
	
	public EventManager() {
		this.listeners = new HashMap<String, EventListener>();
	}
	
	// assinatura/subscrita de eventos por ouvintes
	public void subscribe(String tipoEvento, EventListener listener) {
		this.listeners.put(tipoEvento, listener);
		
		System.out.println("Assinatura de " + listener + " para o evento " + tipoEvento);
	}
	
	// remoção da assinatura
	public void unsubscribe(String tipoEvento, EventListener listener) {
		this.listeners.remove(tipoEvento, listener);

		System.out.println("Remoção de assinatura de " + listener + " para o evento " + tipoEvento);
	}
	
	// processo de notificação
	public void notificar(String tipoEvento, String dados) {
		System.out.println("\nnotificando o evento "+ tipoEvento + " com os dados " + dados);
		
		listeners.get(tipoEvento).update(dados);
	}
}
