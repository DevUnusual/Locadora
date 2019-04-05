package Vehicles;

import Carlos20179026483.Veiculo;

public class Moto extends Veiculo {

	private int cilindradas;
	private double seguro;



	public Moto(String placa, String marca, String modelo, Integer ano, double valor_d, double valor_av,
			int cilindradas) {
		super(placa, marca, modelo, ano, valor_d, valor_av);
		setCilindradas(cilindradas);
		setTipo(1);

	}

	@Override
	public void seguro_d() {
		double diaria;
		diaria = (getValor_avaliado() * 0.11) / 365;
		setSeguro(diaria);
	}
	
	public double aluguel(int d) {
		return (getValor_diaria() + getSeguro()) * d;
	}
	

	public double getSeguro() {
		return seguro;
	}

	public void setSeguro(double seguro) {
		this.seguro = seguro;
	}
	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
}
