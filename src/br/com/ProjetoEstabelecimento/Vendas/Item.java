package br.com.ProjetoEstabelecimento.Vendas;

import br.com.ProjetoEstabelecimento.Produto.Produto;

public class Item {
	public Produto produto;
	public int quantidade ;
	public Item(Produto p , int quantidade){
		this.produto = p;
		this.quantidade =quantidade;
	}
	public double valortotal(){
		return quantidade*produto.getValorP();
	}
	

}
