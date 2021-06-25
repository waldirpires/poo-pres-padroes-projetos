package poo.u8.visitor;

public class XmlVisitor implements Visitor {

	@Override
	public void visitarPonto(Ponto p) {
		System.out.println("<xml>\n" + p.toString()+ "\n</xml>");

	}

	@Override
	public void visitarCirculo(Circulo c) {
		System.out.println("<xml>\n" + c.toString()+ "\n</xml>");
	}

	@Override
	public void visitarRetangulo(Retangulo r) {
		System.out.println("<xml>\n" + r.toString()+ "\n</xml>");

	}

	@Override
	public void visitarDesenhoComposto(DesenhoComposto d) {
		System.out.println("<xml>\n" + d.toString()+ "\n</xml>");

	}

}
