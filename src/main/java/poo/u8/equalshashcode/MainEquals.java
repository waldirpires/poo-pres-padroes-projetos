package poo.u8.equalshashcode;

import java.util.ArrayList;

public class MainEquals {

	public static void main(String[] args) {
		
		var pf1 = new PessoaFisica("José Pereira", "123.456.789-01", "1980.01.01");
		var pf2 = new PessoaFisica("José Gomes", "123.456.789-01", "1980.01.01");
		var pf3 = new PessoaFisica("José Pereira", "321.456.789-01", "1980.01.01");
		var pf4 = new PessoaFisica("José Pereira", "123.456.789-01", "1981.01.01");
		var pf5 = new PessoaFisica("José Pereira", "123.456.789-01", "1980.01.01");
		
		System.out.println(pf1.equals(pf1));
		
		System.out.println(pf1.equals(null));
		
		System.out.println(pf1.equals("teste"));
		
		System.out.println(pf1.equals(pf2)); //nome diferente
		
		System.out.println(pf1.equals(pf3)); //cpf diferente
		
		System.out.println(pf1.equals(pf4)); //data nasc diferente
		
		System.out.println(pf1.equals(pf5)); //iguais
		
		var lista = new ArrayList<PessoaFisica>();
		lista.add(pf1);
		lista.add(pf3);
		lista.add(pf4);
		System.out.println(lista.contains(pf2));
		System.out.println(lista.contains(pf4));
		
		System.out.println(pf1 == pf5); //iguais
		
		var string1 = "teste";
		var string2 = "teste";
		System.out.println(string1 == string2); //iguais
		
		string2 = string2 + "-5";
		System.out.println(string1 == string2); //iguais
		
		System.out.println(pf1.hashCode());
		System.out.println(pf5.hashCode());
		System.out.println(pf4.hashCode());
	}

}
