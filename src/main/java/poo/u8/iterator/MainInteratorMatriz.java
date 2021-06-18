package poo.u8.iterator;

public class MainInteratorMatriz {

	public static void main(String[] args) {
		var colecaoMatriz = new ColecaoMatrizConcreta(3, 4);
		colecaoMatriz.getValores()[0][0] = 2;
		colecaoMatriz.getValores()[0][1] = 1;
		colecaoMatriz.getValores()[0][2] = 4;
		colecaoMatriz.getValores()[0][3] = 0;
		colecaoMatriz.getValores()[2][3] = 29;

		
		// (5) pegar o iterador
		var iterador = colecaoMatriz.criarIterator();

		// segundo iterador
		var iterador2 = colecaoMatriz.criarIterator();

		
		// (5) enquanto houver elementos
		while(iterador.hasMore() && iterador2.hasMore()) {
			// recupero o elemento corrente
			var item = iterador.getNext();
			
			System.out.println(item);
		}				
		
	}
}
