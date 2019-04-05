package Vehicles;

import Carlos20179026483.Veiculo;

public class Caminhao extends Veiculo {
	private double cargaM;
	private double seguro;

	public Caminhao(String placa, String marca, String modelo, Integer ano, double valor_d, double valor_av,
			double cargaM) {
		super(placa, marca, modelo, ano, valor_d, valor_av);
		setTipo(4);
		setCargaM(cargaM);
	}

	public double aluguel(int d) {
		return (getValor_diaria() * getSeguro()) * d;
	}

	@Override
	public void seguro_d() {
		double diaria;
		diaria = (getValor_avaliado() * 0.08) / 365;
		setSeguro(diaria);
	}

	public double getSeguro() {
		return seguro;
	}

	public void setSeguro(double seguro) {
		this.seguro = seguro;
	}

	public double getCargaM() {
		return cargaM;
	}

	public void setCargaM(double cargaM) {
		this.cargaM = cargaM;
	}

}
