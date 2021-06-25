package poo.u8.state;

public class Publicado implements Estado {

	private Documento documento;

	public Publicado(Documento documento) {
		super();
		this.documento = documento;
	}
	
	public Documento getDocumento() {
		return documento;
	}

	@Override
	public void renderizar() {
		System.out.println("Renderizar o documento publicado");
		
	}

	@Override
	public void publicar() {
		System.out.println("Realizar a publicação do documento");		
	}
}
