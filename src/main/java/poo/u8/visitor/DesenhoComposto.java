package poo.u8.visitor;

import java.util.ArrayList;
import java.util.List;

public class DesenhoComposto implements FormaDesenho {

	private List<Ponto> pontos = new ArrayList<Ponto>();

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
		v.visitarDesenhoComposto(this);		
	}

	@Override
	public String toString() {
		return "DesenhoComposto [pontos=" + pontos + "]";
	}	

}