package poo.u7.estrutural.decorator.notificador.depois;

import poo.u7.estrutural.decorator.notificador.antes.Notificador;
import poo.u7.estrutural.decorator.notificador.antes.NotificadorFacebook;

public class DecoradorFacebook extends DecoradorBase {

	private Notificador notificadorFb;
	
	public DecoradorFacebook(Notificador notificador) {
		super(notificador);
		this.notificadorFb = new NotificadorFacebook();
	}
	
	@Override
	public void enviarMensagem(String msg) {
		super.enviarMensagem(msg);
		this.notificadorFb.enviarMensagem(msg);
	}

}
