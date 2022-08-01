package br.com.bancouniversal;

import java.util.ArrayList;
import java.util.List;

public class RendaVariavel implements Investimento<RendaVariavel> {

	@Override
	public List<RendaVariavel> getCarteiraInvestimentos() {
		
		return new ArrayList<RendaVariavel>();
	}

}
