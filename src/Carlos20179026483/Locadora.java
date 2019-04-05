package Carlos20179026483;
import java.util.ArrayList;

public interface Locadora {

	public void inserir(Veiculo v) throws VeiculoJaCadastrado;
	public void inserir(Cliente c) throws ClienteJaCadastrado;
	public Veiculo pesquisar(String placa) throws VeiculoNaoCadastrado; 

    public ArrayList<Veiculo> pesquisarMoto(int cilindrada);
	// tipo de carro
	// 1 (passeio), 2 (SUC), 3 (pickup)
    public ArrayList<Veiculo> pesquisarCarro(int tipoCarro);
    public ArrayList<Veiculo> pesquisarCaminhao(int carga);
    public ArrayList<Veiculo> pesquisarOnibus(int passageiros);
    
    //Seguro Moto = (valor do bem * 11%)/365
    //Seguro Carro = (valor do bem * 3%)/365
    //Seguro Caminh�o = (valor do bem * 8%)/365
    //Seguro �nibus = (valor do bem * 20%)/365
    //Aluguel = (valor da di�ria + seguro) * quantidade de dias
    public double calcularAluguel(String placa, int dias) throws VeiculoNaoCadastrado;
    public void registrarAluguel(String placa, int dias, Cliente c) throws VeiculoNaoCadastrado, VeiculoAlugado, ClienteNaoCadastrado;
    public void registrarDevolucao(String placa, Cliente c) throws VeiculoNaoCadastrado, VeiculoNaoAlugado, ClienteNaoCadastrado;
   
	// tipo de veiculo
	// 0 (todos), 1 (moto), 2 (carro), 3 (caminh�o), 4 (�nibus)
    public void depreciarVeiculos(int tipo, double taxaDepreciacao);
    public void aumentarDiaria(int tipo, double taxaAumento);
    public double faturamentoTotal(int tipo);
    public int quantidadeTotalDeDiarias(int tipo);
}

