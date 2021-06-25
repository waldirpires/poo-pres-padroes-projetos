package poo.u8.mediador;

public class Componente {

	// mediador de todos os componentes
	protected Mediador dialogo;

	public Componente(Mediador dialogo) {
		super();
		this.dialogo = dialogo;
	}
	
	public void clicar() {
		dialogo.notificar(this, "click");
	}
	
	public void apertarBotao() {
		dialogo.notificar(this, "keyPress");
	}
}
