package poo.u7.estrutural.proxy.lab7.caixarapido;

public class MainCaixaRapidoProxy {


	public static void main(String[] args) {
		var conta = new ContaBancaria();
		conta.setSenha("12345");
		conta.setCodLetras("BaRaFa");
		
		var caixaBanco = new CaixaDoBanco(conta);
		
		// proxy
		var caixaRapido = new CaixaRapido(caixaBanco);
		
		try {
			// tentativa de saque
			caixaRapido.acessar("12345", "JiRaFa", 1);
			
		} catch (SenhaInvalidaException | CodLetrasInvalidoException e) {
			// TODO Auto-generated catch block
			System.out.println("Um erro ocorreu: "+ e.getMessage());
		}
	}
	
}
