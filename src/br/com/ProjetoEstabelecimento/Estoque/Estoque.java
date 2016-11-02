package br.com.ProjetoEstabelecimento.Estoque;

import java.util.HashMap;
import java.util.Map;

import br.com.ProjetoEstabelecimento.Produto.Produto;

public class Estoque {
	Map<Produto,Integer> estocar;
	int quant;
	
	
	public Estoque() {
		estocar = new HashMap<Produto, Integer>();
	}
	public void estocar(Produto e,int quant){
		if(estocar.containsKey(e)){
			 int valor = estocar.remove(e);
			valor +=quant;
			estocar.put(e, valor);
		}else
			estocar.put(e, quant);
		
	}
	public String toString(){
		String a = "";
		/* corre o map */
		for(Produto es:estocar.keySet()){
			a=a+"Discricao: " + es.getDescricao() + "  Estoque: "+estocar.get(es) +"  Valor: R$" +es.getValorP()+"\n";
		}
		return a;
		
	}
	public boolean retirar(Produto e,int quant){
		
		if(estocar.get(e)<quant){
			 //lanca exception
		}else{
			int valor = estocar.remove(e);
		    valor -=quant;
		    estocar.put(e, valor);
		}
		
		return true;
		
	}	

}
