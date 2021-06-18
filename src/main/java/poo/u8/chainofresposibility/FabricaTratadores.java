package poo.u8.chainofresposibility;

// (4) criar a cadeia de tratadores na ordem esperada
public class FabricaTratadores {

	/**
	 * Cria a cadeia de tratadores.
	 * 
	 * @return
	 */
	public static Tratador getCadeiaTratadores() {
		// instancio os tratadores
		var tratadorUsuario = new TratadorUsuarioValido();
		var tratadorAutenticacao = new TratadorAutenticacao();
		var tratadorAutorizacao = new TratadorPerfil();
		var tratadorDataInicio = new TratadorDataInicio();
		var tratadorDataFim = new TratadorDataFim();
		var tratadorProcessador = new TratadorProcessarRequisicao();
		
		
		// criar a cadeia de processamento
		tratadorUsuario.setProximo(tratadorAutenticacao);
		tratadorAutenticacao.setProximo(tratadorAutorizacao);
		tratadorAutorizacao.setProximo(tratadorDataInicio);
		tratadorDataInicio.setProximo(tratadorDataFim);
		tratadorDataFim.setProximo(tratadorProcessador);
		
		return tratadorUsuario;
	}
}
