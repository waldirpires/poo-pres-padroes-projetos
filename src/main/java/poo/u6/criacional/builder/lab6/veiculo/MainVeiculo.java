package poo.u6.criacional.builder.lab6.veiculo;

public class MainVeiculo {

	public static void main(String[] args) {
		var builder = new VeiculoBuilderImpl();
		
		builder.comAno(2020);
		builder.comMarca("BMW");
		builder.comModelo("325i");
		builder.comCor("azul");
		builder.comPortas(2);
		
		builder.comJanelas(2);
		builder.comKm(100);
		builder.comPotenciaEmHp(550);
		builder.comRodas(4);
		
		var veiculo = builder.build();
		System.out.println(veiculo);
	}
}
