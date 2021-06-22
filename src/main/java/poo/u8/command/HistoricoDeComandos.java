package poo.u8.command;

import java.util.Stack;

public class HistoricoDeComandos {

	// pilha de comandos executados
	private Stack<Comando> historico = new Stack<Comando>();

	// executo um comando
	public void empilhar(Comando c) {
		historico.push(c);
	}

	// desfazer um comando
	public Comando desempilhar() {
		return historico.pop();
	}

}
