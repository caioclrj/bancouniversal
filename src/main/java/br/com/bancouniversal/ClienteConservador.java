package br.com.bancouniversal;

import java.util.List;

public class ClienteConservador extends Conservador {

	private List<Investimento<RendaFixa>> listaInvestimento;
	
	public void contratarInvestimento(Investimento<RendaFixa> investimento) {
		this.listaInvestimento.add(investimento);
	}

	public List<Investimento<RendaFixa>> getCarteiraInvestimentos() {
		// TODO Auto-generated method stub
		return this.getListaInvestimento();
	}

	public List<Investimento<RendaFixa>> getListaInvestimento() {
		return listaInvestimento;
	}

	public void setListaInvestimento(List<Investimento<RendaFixa>> listaInvestimento) {
		this.listaInvestimento = listaInvestimento;
	}
	
}

	