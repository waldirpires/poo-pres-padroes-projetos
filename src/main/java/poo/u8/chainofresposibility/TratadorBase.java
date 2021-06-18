package poo.u8.chainofresposibility;

// (2) classe pai de todos os tratadores
public abstract class TratadorBase implements Tratador{
	
	private Tratador proximo;
	
	@Override
	public void setProximo(Tratador t) {
		this.proximo = t;
	}
	
	@Override
	public void tratar(Requisicao r) {
		if (this.proximo == null) {
			System.out.println("INFO: cadeia concluida.");
			
			return;
		}
		
		this.proximo.tratar(r);
	}

}
