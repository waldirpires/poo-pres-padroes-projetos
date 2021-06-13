package poo.u8.chainofresposibility;

public class TratadorUsuarioValido extends TratadorBase {
	
	@Override
	public void tratar(Requisicao r) {
		
		if (!"joao.pereira".equals(r.getUser())) {
			System.out.println("ERRO: usuário inválido");

			// sair da cadeia.
			return;
		}
		
		// continuar na cadeia
		super.tratar(r);
	}

}
