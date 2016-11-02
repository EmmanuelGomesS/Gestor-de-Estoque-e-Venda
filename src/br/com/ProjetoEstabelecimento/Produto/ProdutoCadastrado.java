package br.com.ProjetoEstabelecimento.Produto;

import java.util.ArrayList;
import java.util.List;
public class ProdutoCadastrado {
	private List<Produto> produtos =  new ArrayList<Produto>();
	int estoque;
	
	public ProdutoCadastrado(){}
	
	public void addProduto(Produto p){
		this.produtos.add(p);
	}
	public Produto retorP(String s){
		for(Produto c:this.produtos){
			if(c.getDescricao().equals(s)){
				return c;
			}		
		}
		return null;
		
	}
	public String produtoCadastrado(){
		String s = "";
		for(Produto p: this.produtos){
			s =s+ "Dsecricao: "+p.getDescricao() + "\n";
		}
		return s;
	}
	public void alterarDescricao(String s,String novoNome){
		for(Produto p: this.produtos){
			if(p.getDescricao().equals(s)){
				p.setDescricao(novoNome);
			}
		}
	}
	public void alterarValor(String s,double valor){
		for(Produto p: this.produtos){
			if(p.getDescricao().equals(s)){
				p.setValorP(valor);
			}
		}
	}
	public List<Produto>  produtosCadastrado(){
		return produtos;
	}
	
	

}
