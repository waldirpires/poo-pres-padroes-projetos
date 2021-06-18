package poo.u8.chainofresposibility;

public class TratadorProcessarRequisicao extends TratadorBase{
	
	public void tratar(Requisicao r) {
		System.out.println("Tratador " + this.getClass().getSimpleName());
		
		System.out.println("Processando a requisiçao com sucesso: ");
		
		System.out.println(r);
	}

}
