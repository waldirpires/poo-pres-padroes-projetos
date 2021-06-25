package poo.u8.visitor;

public class Circulo implements FormaDesenho{
	
	private Ponto p;
	private int raio;
	
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
		v.visitarCirculo(this);		
	}
	
	@Override
	public String toString() {
		return "Circulo [p=" + p + ", raio=" + raio + "]";
	}	
	
}
