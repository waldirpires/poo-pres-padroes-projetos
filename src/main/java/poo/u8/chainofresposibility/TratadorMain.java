package poo.u8.chainofresposibility;

import java.time.LocalDateTime;

public class TratadorMain {

	public static void main(String[] args) {
		
		var tratador = FabricaTratadores.getCadeiaTratadores();
		
		// objeto de requisição
		var user = "joao.pereira";
		var pw = "654321";
		var perfil = "diretor";
		var requisicao = new RequisicaoUsuario(
				user, 
				pw, 
				perfil, 
				LocalDateTime.of(2021, 6, 20, 8, 0), 
				LocalDateTime.of(2022, 11, 3, 12, 0)
				);
		
		// Problema:
		// - usuário é valido ou nao
		// - senha (autenticação)
		// - perfil (autorização)
		// - acesso em relação a data inicio
		// - acesso em relação a data fim
		
		// execucao da cadeia de acesso
		tratador.tratar(requisicao);
	}
}
