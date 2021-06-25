package poo.u8.visitor;

public interface FormaDesenho {

	void mover(int x, int y);
	
	void desenhar();
	
	void aceitar(Visitor v);
}
