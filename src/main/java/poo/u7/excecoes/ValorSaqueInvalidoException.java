package poo.u7.excecoes;

public class ValorSaqueInvalidoException extends Exception {

	public ValorSaqueInvalidoException(float valor) {
		super("Valor de saque inválido: " + valor);
	}
}
