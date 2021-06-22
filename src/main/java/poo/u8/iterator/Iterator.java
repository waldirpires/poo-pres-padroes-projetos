package poo.u8.iterator;

// (1) interface de interador
public interface Iterator<T> {

	/**
	 * retornar o próximo elemento
	 * @return
	 */
	T getNext();
	
	/**
	 * Informar se existe o próximo elemento ou não
	 * 
	 * @return
	 */
	boolean hasMore();
}
