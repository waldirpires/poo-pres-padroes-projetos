package poo.u8.chainofresposibility;

import java.util.Arrays;

public class TratadorUsuarioValido extends TratadorBase {
	
	@Override
	public void tratar(Requisicao r) {
		System.out.println("=== Tratador: " + this.getClass().getSimpleName() + "\n");
		
		// usuário carregado do banco de dados
		var users = Arrays.asList("joao.pereira", "Maria Silva", "Cristiano Ronaldo");
		
		// usuário não existe
		if (!users.contains(r.getUser())) {
			System.out.println("ERRO: usuário inválido");

			// sair da cadeia.
			return;
		}
		
		// continuar na cadeia
		super.tratar(r);
	}

}
