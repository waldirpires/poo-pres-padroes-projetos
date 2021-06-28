package poo.u7.estrutural.adapter.lab7.string;

import java.util.ArrayList;
import java.util.List;

public class StringToListShortAdapterImpl implements StringToListShortAdapter{

	private Servico servico;
	
	public StringToListShortAdapterImpl(Servico servico) {
		this.servico = servico;
	}
	
	@Override
	public void processarDados(String msg) {
		
		System.out.println("Adaptando dados: " + msg);
		
		var dados = new ArrayList<Short>();
		
		if (msg == null || msg.trim().isEmpty()) {
			return;
		}
		
		for (int i = 0; i < msg.length(); i++) {
			var c = msg.charAt(i);
			dados.add((short) c);
		}
		
		System.out.println("Dados adaptados: "+ dados);
		
		servico.processarDados(dados);
	}

}
