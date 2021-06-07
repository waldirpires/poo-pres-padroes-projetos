package poo.u7.estrutural.flyweight.depois;

public class Cenario {

	public static void main(String[] args) {
		// antes do flyweight
		var floresta = new Floresta("antes");
		floresta.plantar(1, 1, "Ipê", "rosa", "liso");
		floresta.desenhar();
		
		floresta.plantar(1, 2, "Ipê", "amarelo", "liso");
		floresta.plantar(2, 1, "Ipê", "branco", "liso");
		floresta.plantar(2, 2, "Ipê", "branco", "liso");
		floresta.plantar(2, 3, "Ipê", "branco", "liso");
		
		for (int i = 5; i < 100; i = i + 2) {
			floresta.plantar(i, 2, "Ipê", "branco", "liso");			
		}
		floresta.desenhar();
		System.out.println("Quantidade - árvores: " + Arvore.getQuantidade());
		System.out.println("Quantidade - tipo de árvore: " + TipoArvore.getQuantidade());		
		
		System.out.println("\n\n===\n\n");
		
		var floresta2 = new Floresta("depois");
		floresta2.plantar2(1, 1, "Ipê", "rosa", "liso");
		floresta2.desenhar();
		
		floresta2.plantar2(1, 2, "Ipê", "amarelo", "liso");
		floresta2.plantar2(2, 1, "Ipê", "branco", "liso");
		floresta2.plantar2(2, 2, "Ipê", "branco", "liso");
		floresta2.plantar2(2, 3, "Ipê", "branco", "liso");
		
		// demonstração de aplicação do flyweight
		for (int i = 5; i < 100; i = i + 2) {
			floresta2.plantar2(i, 2, "Ipê", "branco", "liso");			
		}
		floresta2.desenhar();
		System.out.println("Quantidade - árvores: " + Arvore.getQuantidade());
		System.out.println("Quantidade - tipo de árvore: " + TipoArvore.getQuantidade());
		
	}
}
