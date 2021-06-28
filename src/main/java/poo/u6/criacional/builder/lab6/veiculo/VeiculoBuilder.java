package poo.u6.criacional.builder.lab6.veiculo;

public interface VeiculoBuilder {

	VeiculoBuilder comPortas(int portas);
	VeiculoBuilder comJanelas(int janelas);
	VeiculoBuilder comRodas(int rodas);
	VeiculoBuilder comMarca(String marca);
	VeiculoBuilder comModelo(String modelo);
	VeiculoBuilder comAno(int ano);
	VeiculoBuilder comKm(int km);
	VeiculoBuilder comPotenciaEmHp(int potenciaEmHp);
	VeiculoBuilder comCor(String cor);
	Veiculo build();
}
