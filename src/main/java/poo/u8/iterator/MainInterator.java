package poo.u8.iterator;

import java.util.ArrayList;
import java.util.Arrays;

public class MainInterator {

	public static void main(String[] args) {
		// colecao iterável
		var colecao = new ColecaoVetorConcreta(10);
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
		
//		var test = "the book is on the table";
//		var list = new ArrayList<CharSequence>();
//		for (int i = 0; i < test.length(); i++) {
//			list.add(test.charAt(i));
//		}
//		var iterator = Arrays.asList(test.toCharArray()).iterator();
//		
//		while (iterator.hasNext()) {
//			var item = iterator.next();
//			
//			System.out.println(item);
//		}
	}
}
