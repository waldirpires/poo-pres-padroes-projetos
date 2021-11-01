package poo.u8.equalshashcode;

public class PessoaFisica {

	private String nomeCompleto;
	
	private String cpf;
	
	private String dataNasc;

	public PessoaFisica(String nomeCompleto, String cpf, String dataNasc) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
	}


	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((dataNasc == null) ? 0 : dataNasc.hashCode());
		result = prime * result + ((nomeCompleto == null) ? 0 : nomeCompleto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // amontam para a mesma referencia de memória
			return true;
		
		if (obj == null) // obj nulo, diferentes
			return false;		
		
		if (getClass() != obj.getClass()) // classes/tipos diferentes
			return false;
		
		PessoaFisica other = (PessoaFisica) obj; // conversão para PF
		
		if (cpf == null) {
			if (other.cpf != null)
				return false;
			
		} else if (!cpf.equals(other.cpf))
			return false;
		
		if (dataNasc == null) {
			if (other.dataNasc != null)
				return false;
			
		} else if (!dataNasc.equals(other.dataNasc))
			return false;
		
		if (nomeCompleto == null) {
			if (other.nomeCompleto != null)
				return false;
			
		} else if (!nomeCompleto.equals(other.nomeCompleto))
			return false;
		
		return true;
	}




	@Override
	public String toString() {
		return "PessoaFisica [nomeCompleto=" + nomeCompleto + ", cpf=" + cpf + ", dataNasc=" + dataNasc + "]";
	}
	
}
