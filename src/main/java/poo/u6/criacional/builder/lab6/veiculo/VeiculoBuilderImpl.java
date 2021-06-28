package poo.u6.criacional.builder.lab6.veiculo;

public class VeiculoBuilderImpl implements VeiculoBuilder {

	private Veiculo veiculo;
	
	public VeiculoBuilderImpl() {
		this.veiculo = new Veiculo();
	}
	
	@Override
	public VeiculoBuilder comPortas(int portas) {
		veiculo.setPortas(portas);
		return this;
	}

	@Override
	public VeiculoBuilder comJanelas(int janelas) {
		veiculo.setJanelas(janelas);
		return this;
	}

	@Override
	public VeiculoBuilder comRodas(int rodas) {
		veiculo.setRodas(rodas);
		return this;
	}

	@Override
	public VeiculoBuilder comMarca(String marca) {
		veiculo.setMarca(marca);
		return this;
	}

	@Override
	public VeiculoBuilder comModelo(String modelo) {
		veiculo.setModelo(modelo);
		return this;
	}

	@Override
	public VeiculoBuilder comAno(int ano) {
		veiculo.setAno(ano);
		return this;
	}

	@Override
	public VeiculoBuilder comKm(int km) {
		veiculo.setKm(km);
		return this;
	}

	@Override
	public VeiculoBuilder comPotenciaEmHp(int potenciaEmHp) {
		veiculo.setPotenciaEmHp(potenciaEmHp);
		return this;
	}

	@Override
	public VeiculoBuilder comCor(String cor) {
		veiculo.setCor(cor);
		return this;
	}

	@Override
	public Veiculo build() {
		return veiculo;
	}

}
