package br.com.ProjetoEstabelecimento.Estoque;

import java.util.HashSet;
import java.util.Map;

import br.com.ProjetoEstabelecimento.Produto.Produto;

public class EstoqueProduto{
	private int quant;
	Produto p;
	private Map<Produto,Integer> produtos;
	public EstoqueProduto(){}
	public EstoqueProduto(Produto p,int qtde){
		this.p = p;
		this.quant = quant+=qtde;
				
	}
	
	public boolean adicionar(int qtde){
		this.quant+=qtde;
		
		return true;
	}
	public boolean retirar(int qtde){
		this.quant-=qtde;
		
		return true;
	}
	
	public int getQuant() {
		return  quant;
	}

	public String getDiscricao() {
		return p.getDescricao();
	}

	public double getValor() {
		return p.getValorP();
	}

	
	

}
