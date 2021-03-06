package poo.u8.state;

public class EmModeracao implements Estado {

	private Documento documento;

	public EmModeracao(Documento documento) {
		super();
		this.documento = documento;
	}
	
	public Documento getDocumento() {
		return documento;
	}

	@Override
	public void renderizar() {
		System.out.println("Executar a lógica do documento moderado");
	}

	@Override
	public void publicar() {
		System.out.println("ALERTA: documento ainda não está publicado.");
		
	}
}
