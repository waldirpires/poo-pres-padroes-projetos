package poo.u8.chainofresposibility;

public class TratadorAutenticacao extends TratadorBase{
	
	@Override
	public void tratar(Requisicao r) {
		
		var user = "joao.pereira";
		var pw = "654321";
		
		// senha inválida
		if (r.getUser().equals(user) && !r.getPassword().equals(pw)) {
			System.out.println("ERRO: senha inválida!\n");
			
			// sair da cadeia
			return;
		}
		
		// continuar na cadeia
		super.tratar(r);
	}

}
