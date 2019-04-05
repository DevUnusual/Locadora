package Vehicles;

import Carlos20179026483.Veiculo;

public class Carro extends Veiculo {
	private String categoria;
	private double seguro;

	public Carro(int tipo, String placa, String marca, String modelo, Integer ano, double valor_d, double valor_av,
			String categoria) {
		super(placa, marca, modelo, ano, valor_d, valor_av);
		setTipo(2);
		setCategoria(categoria);
	}

	public double aluguel(int d) {
		return (getValor_diaria() * getSeguro()) * d;
	}

	@Override
	public void seguro_d() {
		double diaria;
		diaria = (getValor_avaliado() * 0.03) / 365;
		setSeguro(diaria);
	}

	public double getSeguro() {
		return seguro;
	}

	public void setSeguro(double seguro) {
		this.seguro = seguro;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
