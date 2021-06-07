package poo.u7.estrutural.decorator.notificador.depois;

import poo.u7.estrutural.decorator.notificador.antes.Notificador;
import poo.u7.estrutural.decorator.notificador.antes.NotificadorFacebook;

public class FacebookDecorator extends DecoradorBase {

	private Notificador notificadorFb;
	
	public FacebookDecorator(Notificador notificador) {
		super(notificador);
		this.notificadorFb = new NotificadorFacebook();
	}
	
	@Override
	public void enviarMensagem(String msg) {
		super.enviarMensagem(msg);
		this.notificadorFb.enviarMensagem("Prédio caindo!");
	}

}
