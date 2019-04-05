package Carlos20179026483;

import java.util.ArrayList;

import repositorio.RepositorioDeVeiculos;

public class SistemaLocadora implements Locadora{
	RepositorioDeVeiculos repositorio = new RepositorioDeVeiculos();

	@Override
	public void inserir(Veiculo v) throws VeiculoJaCadastrado {
		repositorio.inserirR(v);
	}

	@Override
	public void inserir(Cliente c) throws ClienteJaCadastrado {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Veiculo pesquisar(String placa) throws VeiculoNaoCadastrado {
		repositorio.procurar(placa);
		return null;
	}

	@Override
	public ArrayList<Veiculo> pesquisarMoto(int cilindrada) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Veiculo> pesquisarCarro(int tipoCarro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Veiculo> pesquisarCaminhao(int carga) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Veiculo> pesquisarOnibus(int passageiros) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calcularAluguel(String placa, int dias) throws VeiculoNaoCadastrado {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void registrarAluguel(String placa, int dias, Cliente c)
			throws VeiculoNaoCadastrado, VeiculoAlugado, ClienteNaoCadastrado {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registrarDevolucao(String placa, Cliente c)
			throws VeiculoNaoCadastrado, VeiculoNaoAlugado, ClienteNaoCadastrado {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depreciarVeiculos(int tipo, double taxaDepreciacao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aumentarDiaria(int tipo, double taxaAumento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double faturamentoTotal(int tipo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int quantidadeTotalDeDiarias(int tipo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
