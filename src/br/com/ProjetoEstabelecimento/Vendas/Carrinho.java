package br.com.ProjetoEstabelecimento.Vendas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import br.com.ProjetoEstabelecimento.Produto.Produto;

public class Carrinho {
	Map<Produto,Item> itens;
	int quant;
	
	
	public Carrinho() {
		itens = new HashMap<Produto, Item>();
	}
	public boolean adicionarProduto(Produto p,int quant){
		if(itens.containsKey(p)){
			  itens.get(p).quantidade+=quant;
			
		}else
			itens.put(p, new Item(p,quant));
		return true;
	}
	public String toString(){
		String a = "";
		/* corre o map */
		for(Produto prod:itens.keySet()){
			a=a+ prod.getDescricao() +"   "+itens.get(prod).quantidade +"          "+
					prod.getValorP()+"          "+itens.get(prod).valortotal()+"\n ";
		}
		return a;
		
	}
	public boolean adicionarProduto(Produto p){
		return adicionarProduto(p, 1);			
	}
	public double total(){
		double total = 0;
		for(Produto p:itens.keySet()){
			total+=p.getValorP()*itens.get(p).quantidade;
		}
		return total;
	}
	public void removerProduto(Produto p,int quant){
		for(Produto pro:itens.keySet())
			if(p.equals(pro))
				itens.remove(pro);
	}
	public Iterator<Item> listaProdutos(){
		return itens.values().iterator();
	}
	

}
