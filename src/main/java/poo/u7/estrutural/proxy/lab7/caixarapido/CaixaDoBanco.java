package poo.u7.estrutural.proxy.lab7.caixarapido;

public class CaixaDoBanco implements AcessoContaBancaria{

	private ContaBancaria conta;
	
	public CaixaDoBanco(ContaBancaria conta) {
		super();
		this.conta = conta;
	}

	@Override
	public void acessar(String senha, String codLetras, int op) throws SenhaInvalidaException, CodLetrasInvalidoException {
		// TODO Auto-generated method stub
		
		System.out.println("Executando a operação "+ op);
	}

	public String getSenha() {
		return conta.getSenha();
	}
	
	public String getCodLetras() {
		return conta.getCodLetras();
	}
}
