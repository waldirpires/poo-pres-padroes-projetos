package poo.u7.estrutural.proxy.lab7.caixarapido;

public class ContaBancaria {

	private String codAgencia;
	private String numero;
	private String senha;
	private String codLetras;
	
	public void efetuarSaque(float valor) {
		System.out.println("Efetuando saque de " + valor);
	}
	
	public void efetuarDeposito(float valor) {
		System.out.println("Efetuando depósito de " + valor);
	}
	
	public void efetuarTransferencia(float valor) {
		System.out.println("Efetuando transferência de " + valor);		
	}
	
	public void alterarDadosPessoais()  {
		System.out.println("Alterando dados pessoais");
	}

	public String getCodAgencia() {
		return codAgencia;
	}

	public void setCodAgencia(String codAgencia) {
		this.codAgencia = codAgencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCodLetras() {
		return codLetras;
	}

	public void setCodLetras(String codLetras) {
		this.codLetras = codLetras;
	}
	
	
	
}
