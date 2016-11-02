package br.com.ProjetoEstabelecimento.Produto;

public class Produto {
	private String descricao;
	private int codgo;
	private double valorP;
	private static int codgoProduto = 1;
	
	public Produto(){}
	public Produto(String descricao,double valorP){
		this.descricao = descricao;
		this.valorP = valorP;
		this.codgo = Produto.codgoProduto;
		++Produto.codgoProduto;
			
	}
	public int getCodgo() {
		return codgo;
	}
	public double getValorP() {
		return valorP;
	}
	public void setValorP(double valorP) {
		this.valorP = valorP;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
