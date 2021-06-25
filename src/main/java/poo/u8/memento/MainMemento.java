package poo.u8.memento;

public class MainMemento {

	public static void main(String[] args) {
		var editor = new EditorDeTexto();
		
		var cuidador = new Comando(editor);
		
		// estado iniciar o objeto de origem
		editor.setTexto("the book is on the table");
		editor.setPosicaoCursor(10);
		editor.setSelecao("book ");
		
		System.out.println(editor + "\n");
		
		// armazenar o estado atual num memento/snapshot
		cuidador.fazerBackup();
		
		// mudar todos os atributos
		editor.setTexto("the sky is blue");
		editor.setPosicaoCursor(0);
		editor.setSelecao("the");

		System.out.println(editor + "\n");

		// desfazer a ultima modificacao
		cuidador.desfazer();
		
		System.out.println(editor + "\n");

	}
}
