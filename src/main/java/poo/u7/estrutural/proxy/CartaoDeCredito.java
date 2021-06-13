package poo.u7.estrutural.proxy;

// objeto proxy
public class CartaoDeCredito implements Pagamento {

	// Criar uma classe de proxy, com um atributo referenciando a classe de serviço
	private PagamentoEmDinheiro pagamentoEmDinheiro;
	
	private float valor;
	
	public CartaoDeCredito() {
		this.pagamentoEmDinheiro = new PagamentoEmDinheiro();
	}
	
	// Implementar os métodos da classe proxy, delegando o trabalho para a classe de serviço
	@Override
	public void pagar(float valor) {
		// validação que pode não chamar o objeto principal
		if (valor < 0) {
			System.out.println("ERRO: pagamento inválido.");
			
			return;
		}

		// delegação: o objeto principal é chamado 
		this.valor = valor;
		
		System.out.println("Pagando " + valor + " via cartão de crédito na data de vencimento\n\n");
		
		pagamentoEmDinheiro.pagar(valor);
	}

	@Override
	public String toString() {
		return "CartaoDeCredito [valor=" + valor + "]";
	}	

}
