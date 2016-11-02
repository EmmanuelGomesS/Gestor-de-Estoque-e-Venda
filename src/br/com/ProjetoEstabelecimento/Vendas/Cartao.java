package br.com.ProjetoEstabelecimento.Vendas;

public class Cartao extends Pagamento{
	private double valortotal;
	private double parcela;
	public Cartao(double valortotal,double parcela){
		this.parcela = parcela;
		this.valortotal = valortotal;
	}
	public boolean validarparcela(){
		boolean vlparcel = false;
		return vlparcel;
	}

	public String finalizarPagamento() {
		
		return null;
	}

}
