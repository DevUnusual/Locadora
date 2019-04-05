package Vehicles;

import Carlos20179026483.Veiculo;

public class Onibus extends Veiculo {
	private int capacidade;
	private double seguro;

	public Onibus(String placa, String marca, String modelo, Integer ano, double valor_d, double valor_av,
			int capacidade) {
		super(placa, marca, modelo, ano, valor_d, valor_av);
		setTipo(3);
		setCapacidade(capacidade);
	}

	public double aluguel(int d) {
		return (getValor_diaria() * getSeguro()) * d;
	}
	

	@Override
	public void seguro_d() {
		double diaria;
		diaria = (getValor_avaliado() * 0.2) / 365;
		setSeguro(diaria);
	}

	public double getSeguro() {
		return seguro;
	}

	public void setSeguro(double seguro) {
		this.seguro = seguro;
	}
	public int getCapacidade() {
		return capacidade;
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

}
