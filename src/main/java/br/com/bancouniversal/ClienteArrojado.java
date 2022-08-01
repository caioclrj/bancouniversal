package br.com.bancouniversal;

import java.util.List;

public class ClienteArrojado extends Arrojado {

	private List<Investimento<RendaVariavel>> listaInvestimento;
	
	public void contratarInvestimento(Investimento<RendaVariavel> investimento) {
		// TODO Auto-generated method stub
		this.listaInvestimento.add(investimento);
	}

	public List<Investimento<RendaVariavel>> getCarteiraInvestimentos() {
		// TODO Auto-generated method stub
		return this.getListaInvestimento();
	}

	public List<Investimento<RendaVariavel>> getListaInvestimento() {
		return listaInvestimento;
	}

	public void setListaInvestimento(List<Investimento<RendaVariavel>> listaInvestimento) {
		this.listaInvestimento = listaInvestimento;
	}
	
}
