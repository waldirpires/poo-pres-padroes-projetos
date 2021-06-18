package poo.u8.command;

import java.util.ArrayList;
import java.util.List;

public class Aplicacao {

	private String areaDeTransferencia; // clipboard
	
	private List<Editor> editores = new ArrayList<Editor>();
	
	private Editor editorAtivo;
	
	private HistoricoDeComandos historico = new HistoricoDeComandos();
	
	public void adicionarEditor(Editor e) {
		this.editores.add(e);
	}
	
	public void setEditorAtivo(Editor editorAtivo) {
		this.editorAtivo = editorAtivo;
	}
	
	public Editor getEditorAtivo() {
		return editorAtivo;
	}
	
	public String getAreaDeTransferencia() {
		return areaDeTransferencia;
	}
	
	public void setAreaDeTransferencia(String areaDeTransferencia) {
		this.areaDeTransferencia = areaDeTransferencia;
	}
	
	public void desfazer() {
		var comando = historico.desempilhar();
		
		comando.desfazer(); // undo - desfazer
	}
	
	public void executarComando(ComandoImpl c) {
		// execucao do comando pelo receptor (app)
		if (c.executar()) {
			historico.empilhar(c);
		}
	}
}
