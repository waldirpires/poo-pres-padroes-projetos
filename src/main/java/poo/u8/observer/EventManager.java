package poo.u8.observer;

import java.util.HashMap;
import java.util.Map;

public class EventManager {
	private Map<String, EventListener> listeners;
	
	public EventManager() {
		this.listeners = new HashMap<String, EventListener>();
	}
	
	public void subscribe(String tipoEvento, EventListener listener) {
		this.listeners.put(tipoEvento, listener);
		
		System.out.println("Assinatura de " + listener + " para o evento " + tipoEvento);
	}
	
	public void unsubscribe(String tipoEvento, EventListener listener) {
		this.listeners.remove(tipoEvento, listener);

		System.out.println("Remoçaõ de assinatura de " + listener + " para o evento " + tipoEvento);
	}
	
	public void notificar(String tipoEvento, String dados) {
		System.out.println("notificando o evento "+ tipoEvento + " com os dados " + dados);
		for (var eventListener: this.listeners.values()) {
			eventListener.update(dados);
		}
	}
}
