package poo.u7.estrutural.proxy;

public class CartaoDeCredito implements Pagamento {

	private PagamentoEmDinheiro pagamentoEmDinheiro;
	
	private float valor;
	
	public CartaoDeCredito() {
		this.pagamentoEmDinheiro = new PagamentoEmDinheiro();
	}
	
	@Override
	public void pagar(float valor) {
		this.valor = valor;
		
		System.out.println("Pagando " + valor + " via cartão de crédito na data de vencimento\n\n");
		
		pagamentoEmDinheiro.pagar(valor);
	}

	@Override
	public String toString() {
		return "CartaoDeCredito [valor=" + valor + "]";
	}	

}
