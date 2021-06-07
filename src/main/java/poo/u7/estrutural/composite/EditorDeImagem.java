package poo.u7.estrutural.composite;

public class EditorDeImagem {

	public static void main(String[] args) {
		var p1 = new Ponto(2, 2);
		p1.mover(1, 1);
		p1.desenhar();
		
		var p2 = new Ponto(4, 4);
		p2.desenhar();
		
		var c1 = new Circulo(2,  2, 4);
		c1.mover(1, 1);
		c1.desenhar();
		
		var composite = new GraficoComposto();
		composite.adicionarFilho(p1);
		composite.adicionarFilho(p2);
		composite.mover(3, 2);
		composite.desenhar();
	}
}
