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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void publicar() {
		// TODO Auto-generated method stub
		
	}
}
