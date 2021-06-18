package poo.u8.iterator;

// (3) 
public class IteratorMatrizConcreto implements Iterator<Integer>{

	private ColecaoMatrizConcreta matriz;
	
	private int m;
	private int n;
	
	private int cont = 0;
	
	public IteratorMatrizConcreto(ColecaoMatrizConcreta matriz) {
		this.matriz = matriz;
	}
	
	@Override
	public Integer getNext() {
		
		int valor = matriz.getValores()[m][n];
		cont++;
		n++;
		
		// navegando para a proxima linha da matriz
		if (n == matriz.getN()) {
			m ++;
			n = 0;
		}
		
		return valor;
	}

	@Override
	public boolean hasMore() {
		return cont < matriz.getM() * matriz.getN();
	}

}
