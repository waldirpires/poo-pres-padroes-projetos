package poo.u7.estrutural.composite;

import java.util.ArrayList;
import java.util.List;

public class GraficoComposto implements Grafico{

	private List<Grafico> filhos = new ArrayList<Grafico>();

	public void adicionarFilho(Grafico g) {
		this.filhos.add(g);
	}
	
	public void removerFilho(Grafico g) {
		this.filhos.remove(g);
	}
	
	@Override
	public void mover(int x, int y) {
		for (var filho: filhos) {
			filho.mover(x, y);			
		}
	}

	@Override
	public String toString() {
		return "GraficoComposto [filhos=" + filhos + "]";
	}

	@Override
	public void desenhar() {
		System.out.println("Desenhando: " + this.toString());		
	}

}
