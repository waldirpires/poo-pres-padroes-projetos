package poo.u7.estrutural.decorator.notificador.depois;

import poo.u7.estrutural.decorator.notificador.antes.NotificadorEmail;
import poo.u7.estrutural.decorator.notificador.antes.NotificadorFumaca;

public class MainDecorator {

	public static void main(String[] args) {
		// objeto base
		var notificadorEmail = new NotificadorEmail();
		// objeto decorado
		var decoradorEmailSms = new DecoradorSms(notificadorEmail);
		
		decoradorEmailSms.enviarMensagem("Olá mundo");			
		System.out.println("\n=====\n");
		
		// decorador slack, sms e email
		var decoradorSlack = new DecoradorSlack(decoradorEmailSms);
		decoradorSlack.enviarMensagem("Casa pegando fogo!");
		
		var fumaca = new NotificadorFumaca();
		var decoradorEmail = new DecoratorEmail(fumaca);
		decoradorEmail.enviarMensagem("teste 123");
	}
}
