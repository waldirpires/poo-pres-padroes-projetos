package poo.u6.criacional.builder.lab6.veiculo;

public class Veiculo {
	
	private int portas;
	private int janelas;
	private int rodas;
	private String marca;
	private String modelo;
	private int ano;
	private int km;
	private int potenciaEmHp;
	private String cor;
	
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	public int getJanelas() {
		return janelas;
	}
	public void setJanelas(int janelas) {
		this.janelas = janelas;
	}
	public int getRodas() {
		return rodas;
	}
	public void setRodas(int rodas) {
		this.rodas = rodas;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public int getPotenciaEmHp() {
		return potenciaEmHp;
	}
	public void setPotenciaEmHp(int potenciaEmHp) {
		this.potenciaEmHp = potenciaEmHp;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		return "Veiculo [portas=" + portas + ", janelas=" + janelas + ", rodas=" + rodas + ", marca=" + marca
				+ ", modelo=" + modelo + ", ano=" + ano + ", km=" + km + ", potenciaEmHp=" + potenciaEmHp + ", cor="
				+ cor + "]";
	}

	
}
