package poo.u8.observer;

public class Arquivo {
	
	private String nome;
	
	public Arquivo(String nome) {
		this.nome = nome;
	}

	public void write(String msg) {
		System.out.println(nome + ": " + msg);
	}

	public String getNome() {
		return nome;
	}
}
