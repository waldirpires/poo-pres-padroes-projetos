package poo.u8.command;

import java.util.Stack;

public class HistoricoDeComandos {

	private Stack<ComandoImpl> historico = new Stack<ComandoImpl>();

	public void empilhar(ComandoImpl c) {
		historico.push(c);
	}

	public ComandoImpl desempilhar() {
		return historico.pop();
	}

}
