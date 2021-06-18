package poo.u8.chainofresposibility;

// (1) definir a interface tratador com metodp
public interface Tratador {

	// setar o proximo tratador na cadeia
	void setProximo(Tratador t);
	
	// processar a requisição
	void tratar(Requisicao r);
}
