package poo.u8.visitor;

public interface Visitor {
	
	void visitarPonto(Ponto p);
	
	void visitarCirculo(Circulo c);
	
	void visitarRetangulo(Retangulo r);
	
	void visitarDesenhoComposto(DesenhoComposto d);
}
