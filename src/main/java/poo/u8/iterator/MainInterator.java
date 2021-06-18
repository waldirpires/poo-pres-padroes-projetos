package poo.u8.iterator;

public class MainInterator {

	public static void main(String[] args) {
		// colecao iterável
		var colecao = new ColecaoConcreta(10);
		colecao.adicionar("the");
		colecao.adicionar("book");
		colecao.adicionar("is");
		colecao.adicionar("on");
		colecao.adicionar("the");
		colecao.adicionar("table");
		
		// obter o iterador da coleção
		var iterador = colecao.criarIterator();
		
		// enquanto houver elementos
		while(iterador.hasMore()) {
			// recupero o elemento corrente
			var item = iterador.getNext();
			
			System.out.println(item);
		}
	}
}
