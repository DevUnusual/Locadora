package Carlos20179026483;

public abstract class Veiculo {
	private String placa = "", marca = "", modelo = "";
	private int ano;
	private double valor_diaria, valor_avaliado;
	private int tipo;
	
	public Veiculo(String placa, String marca, String modelo, int ano, double valor_d, double valor_av) {
		setAno(ano);
		setMarca(marca);
		setModelo(modelo);
		setPlaca(placa);
		setValor_avaliado(valor_av);
		setValor_diaria(valor_d);
	}
	
	public abstract void seguro_d();
	
	public void aumentar_D(int x) {
		setValor_diaria(valor_diaria*(x/100));
	}
	
	public void diminuir_D(int x) {
		setValor_diaria(valor_diaria*(-x/100));
	}
	
	public void aumentar_Valor(int x) {
		setValor_avaliado(valor_avaliado*(x/100));
	}
	
	public void diminuir_Valor(int x) {
		setValor_avaliado(valor_avaliado*(-x/100));
	}
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
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
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public double getValor_diaria() {
		return valor_diaria;
	}
	public void setValor_diaria(double valor_diaria) {
		this.valor_diaria = valor_diaria;
	}
	public double getValor_avaliado() {
		return valor_avaliado;
	}
	public void setValor_avaliado(double valor_avaliado) {
		this.valor_avaliado = valor_avaliado;
	}


















	public int getTipo() {
		return tipo;
	}


















	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
}
