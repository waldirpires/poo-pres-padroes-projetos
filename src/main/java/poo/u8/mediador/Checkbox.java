package poo.u8.mediador;

public class Checkbox extends Componente{

	private boolean check;
	
	public Checkbox(Mediador dialogo) {
		super(dialogo);
		// TODO Auto-generated constructor stub
	}

	public void checar() {
		this.check = !check;
		dialogo.notificar(this, "check");
	}
	
	public boolean isCheck() {
		return check;
	}
}