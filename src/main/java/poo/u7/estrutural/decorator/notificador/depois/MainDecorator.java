package poo.u7.estrutural.decorator.notificador.depois;

import poo.u7.estrutural.decorator.notificador.antes.NotificadorEmail;

public class MainDecorator {

	public static void main(String[] args) {
		// objeto base
		var notificadorEmail = new NotificadorEmail();
		// objeto decorado
		var decoradorEmailSms = new DecoradorSms(notificadorEmail);
		
		decoradorEmailSms.enviarMensagem("Olá mundo");			
		System.out.println("\n=====\n");
		
		// decorador slack, sms e email
		var decoradorSlack = new DecoradorSlack(notificadorEmail);
		decoradorSlack.enviarMensagem("Casa pegando fogo!");
	}
}
