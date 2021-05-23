package poo.u6.criacional.singleton;

public class BancoDeDados {

    // (1) atributo estático privado
    private static BancoDeDados singleton;

    // (4) construtor privado da classe
    private BancoDeDados() {
    }

    // (2) método publico estático para acessar a instância
    public static BancoDeDados getInstance() {
        // se a instancia ainda nao foi criada, criar ela
        // (3) inicialização atrasada
        if (singleton == null) {
            singleton = new BancoDeDados();
        }

        // retornar a instância
        return singleton;
    }

    public void conectar() {
        System.out.println("Conexão bem-sucedida.");
    }
}
