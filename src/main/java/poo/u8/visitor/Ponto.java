package poo.u8.visitor;

public class Ponto implements FormaDesenho{

	private int x;
	private int y;
	
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
		v.visitarPonto(this);
	}
	
	@Override
	public String toString() {
		return "Ponto [x=" + x + ", y=" + y + "]";
	}
	
}
