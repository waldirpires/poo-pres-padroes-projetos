package poo.u8.chainofresposibility;

import java.util.Arrays;

public class TratadorAutenticacao extends TratadorBase{
	
	@Override
	public void tratar(Requisicao r) {
		System.out.println("=== Tratador: " + this.getClass().getSimpleName() + "\n");
		
		var users = Arrays.asList("joao.pereira", "Maria Silva", "Cristiano Ronaldo");
		var pw = "654321";
		
		// senha inválida
		if (users.contains(r.getUser()) && !r.getPassword().equals(pw)) {
			System.out.println("ERRO: senha inválida!\n");
			
			// sair da cadeia
			return;
		}
		
		// continuar na cadeia
		super.tratar(r);
	}

}
