package br.com.bancouniversal;

import java.util.List;

public abstract class Cliente<T> {

	public abstract void contratarInvestimento(Investimento<T> investimento);
	public abstract List<Investimento<T>> getCarteiraInvestimentos();
}
