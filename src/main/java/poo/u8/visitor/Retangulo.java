package poo.u8.visitor;

public class Retangulo implements FormaDesenho {
	
	private Ponto p1;
	private Ponto p2;
	private Ponto p3;
	private Ponto p4;
	
	@Override
	public void mover(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void desenhar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void aceitar(Visitor v) {
		v.visitarRetangulo(this);		
	}
	
	@Override
	public String toString() {
		return "Retangulo [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + ", p4=" + p4 + "]";
	}
	
}
