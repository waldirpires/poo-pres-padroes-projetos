package poo.u7.estrutural.proxy;

public class PagamentoViaPix implements Pagamento {

	private PagamentoEmDinheiro pagamentoEmDinheiro;
	
	@Override
	public void pagar(float valor) {
		// validação que pode não chamar o objeto principal
		if (valor < 0) {
			System.out.println("ERRO: pagamento inválido.");
			
			return;
		}

		// delegação: o objeto principal é chamado 
		
		System.out.println("Pagando " + valor + " via cartão de crédito na data de vencimento\n\n");
		
		// inicialização tardia
		this.pagamentoEmDinheiro = new PagamentoEmDinheiro();
		pagamentoEmDinheiro.pagar(valor);
	}

}
