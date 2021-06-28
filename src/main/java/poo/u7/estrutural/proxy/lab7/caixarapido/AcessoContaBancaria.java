package poo.u7.estrutural.proxy.lab7.caixarapido;

public interface AcessoContaBancaria {

	public void acessar(String senha, String codLetras, int op) throws SenhaInvalidaException, CodLetrasInvalidoException;
}
