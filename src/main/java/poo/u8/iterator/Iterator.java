package poo.u8.iterator;

// (1) interface de interador
public interface Iterator<T> {

	T getNext();
	
	boolean hasMore();
}
