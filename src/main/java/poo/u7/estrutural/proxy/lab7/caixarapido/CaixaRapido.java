package poo.u7.estrutural.proxy.lab7.caixarapido;

import java.time.Duration;
import java.time.LocalDateTime;

// Proxy
public class CaixaRapido implements AcessoContaBancaria {
	
	private LocalDateTime dataHoraUltimoAcesso;

	private CaixaDoBanco caixa;
	
	public CaixaRapido(CaixaDoBanco caixa) {
		this.caixa = caixa;
	}
	
	@Override
	public void acessar(String senha, String codLetras, int op) throws SenhaInvalidaException, CodLetrasInvalidoException {
		// TODO Auto-generated method stub
		
		// processando o tempo de acesso desde a ultima vez que a validação foi realizada
		var agora = LocalDateTime.now();
		var tempo = Duration.between(dataHoraUltimoAcesso, agora).toMinutes();
		if (dataHoraUltimoAcesso == null || tempo > 3) {
			
			dataHoraUltimoAcesso = agora;
			
			if (!caixa.getSenha().equals(senha)) {
				throw new SenhaInvalidaException("Senha inválida!");
			} else if (!caixa.getCodLetras().equals(codLetras)) {
				throw new CodLetrasInvalidoException("Código de letras inválido!");
			}			
		}

		System.out.println("Acesso do caixa rápido validado com sucesso.\n");
		
		caixa.acessar(senha, codLetras, op);
	}
	
	

}
