package br.com.bancouniversal;

public class Aplicacao {

	public static void main(String[] args) {
		
	    var conservador = new ClienteConservador();
	    //m?todo contratarInvestimento adiciona na lista de investimentos do cliente
	    conservador.contratarInvestimento(new CDB());
	    conservador.contratarInvestimento(new Tesouro());

	    //conservador.contratarInvestimento(new Acao());//ERRO de compila??o
	    for (Investimento<? extends RendaFixa> i : conservador.getCarteiraInvestimentos()) {
	        System.out.println(i);
	    }

	    var arrojado = new ClienteArrojado();
	    arrojado.contratarInvestimento(new Acao());
	    arrojado.contratarInvestimento(new FundoImobiliario());

	    //arrojado.contratarInvestimento(new Tesouro());//ERRO de compila??o
	    for (Investimento<? extends RendaVariavel> i : arrojado.getCarteiraInvestimentos()) {
	        System.out.println(i);
	    }
	}

}
