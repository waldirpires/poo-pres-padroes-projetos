package poo.u8.iterator;

// (2, 4) 
public class ColecaoMatrizConcreta implements IterableCollection<Integer>{

	private int[][] valores;
	
	private int m;
	private int n; // mXn
	
	public ColecaoMatrizConcreta(int m, int n) {
		this.n = n;
		this.m = m;
		
		this.valores = new int[m][n];
	}
	
	@Override
	public Iterator<Integer> criarIterator() {
		return new IteratorMatrizConcreto(this);
	}
	
	public int getM() {
		return m;
	}
	
	public int getN() {
		return n;
	}
	
	public int[][] getValores() {
		return valores;
	}
}
