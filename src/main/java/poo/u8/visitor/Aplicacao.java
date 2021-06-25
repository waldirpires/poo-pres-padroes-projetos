package poo.u8.visitor;

import java.util.ArrayList;
import java.util.List;

public class Aplicacao {

	private List<FormaDesenho> formas = new ArrayList<FormaDesenho>();
	
	public void exportar() {
		var visitador = new XmlVisitor();
		
		for (var forma: formas) {
			forma.aceitar(visitador);
		}
	}
}
