package poo.u8.mediador;

public class Checkbox extends Componente{

	private boolean check;
	
	public Checkbox(Mediador dialogo) {
		super(dialogo);
		// TODO Auto-generated constructor stub
	}

	// 6 componentes referenciando o mediador
	public void checar() {
		this.check = !check; // mudança de estado (true/false)
		
		// mediador entra em ação para notificar todos os componentes
		dialogo.notificar(this, "check");
	}
	
	public boolean isCheck() {
		return check;
	}
}
