package poo.u8.iterator;

// (3) implementacao do iterador
public class IteratorConcreto implements Iterator<String>{

	private ColecaoConcreta colecao;
	
	private int index = 0;
	
	public IteratorConcreto(ColecaoConcreta colecao) {
		this.colecao = colecao;
	}
	
	@Override
	public String getNext() {
		// se o indice já estiver no final
		if (index == colecao.getIndex()) {
			System.out.println("ERROR: não existem mais elementos.\n");
			
			return null;
		}
		
		var valor = colecao.getValores()[index];
		index++;
		
		return valor;
	}

	@Override
	public boolean hasMore() {
		return index < colecao.getIndex();
	}

}
