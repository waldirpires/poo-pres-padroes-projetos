package poo.u7.estrutural.adapter.lab7.string;

public class MainStringToListShort {

	public static void main(String[] args) {
		var cliente = new Cliente();
		
		var servico = new Servico();
		
		var adapter = new StringToListShortAdapterImpl(servico);
		
		adapter.processarDados(cliente.fornecerDados());
	}
}
