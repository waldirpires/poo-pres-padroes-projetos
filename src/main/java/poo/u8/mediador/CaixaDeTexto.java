package poo.u8.mediador;

public class CaixaDeTexto extends Componente{

	private String texto;
	
	public CaixaDeTexto(Mediador dialogo) {
		super(dialogo);
		// TODO Auto-generated constructor stub
	}

	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "CaixaDeTexto [texto=" + texto + "]";
	}
	
	
}
