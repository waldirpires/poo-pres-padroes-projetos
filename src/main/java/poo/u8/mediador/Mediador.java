package poo.u8.mediador;

// 2
public interface Mediador {

	// 3 protocolo de comunicação entre os componentes
	void notificar(Componente enviador, String evento);
}
