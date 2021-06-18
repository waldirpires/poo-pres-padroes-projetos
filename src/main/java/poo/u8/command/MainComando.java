package poo.u8.command;

// Enviador dos comandos para o receptor
public class MainComando {

	public static void main(String[] args) {
		var app = new Aplicacao(); // receptor
		
		var editor = new Editor();
		
		app.adicionarEditor(editor);
		app.setEditorAtivo(editor);
		
		editor.setTexto("the book is on the table");
		
		editor.setSelecao("table");
		
		// ctrl+c
		var copiar = new ComandoCopiar(app, editor);
		app.executarComando(copiar);
		
		// ctrl+v
		var colar = new ComandoColar(app, editor);
		app.executarComando(colar);
		
		System.out.println(editor.getTexto());
		
		// ctrl+x
		editor.setSelecao("book");
		var cortar = new ComandoCortar(app, editor);
		app.executarComando(cortar);
		
		System.out.println(editor.getTexto());
		
		// ctrl+z
		var desfazer = new ComandoDesfazer(app, editor);
		app.executarComando(desfazer);
		
		System.out.println(editor.getTexto());
		
	}
}
