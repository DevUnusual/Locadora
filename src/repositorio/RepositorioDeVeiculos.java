package repositorio;

import java.util.ArrayList;
import Carlos20179026483.Veiculo;

public class RepositorioDeVeiculos {
	ArrayList<Veiculo> locadora = new ArrayList<Veiculo>();

	public boolean validarV(Veiculo x) {
		for (Veiculo y : locadora) {
			if (y.equals(x))
				return false;
		}
		return true;
	}

	public Veiculo procurar(String placa) {
		for (Veiculo y : locadora) {
			if (y.getPlaca().equals(placa))
				return y;
		}
		return null;
	}

	public void inserirR(Veiculo x) {
		if (validarV(x))
			locadora.add(x);
	}

}
