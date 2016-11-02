package br.com.ProjetoEstabelecimento.Vendas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Iterator;
import java.util.List;

import br.com.ProjetoEstabelecimento.Cadastro.Cliente;
import br.com.ProjetoEstabelecimento.Cadastro.Funcionario;
import br.com.ProjetoEstabelecimento.Estoque.Estoque;
import br.com.ProjetoEstabelecimento.Produto.Produto;

public class Venda {
	private String cliente;
	private String funcio;
	private List<Produto> listaProduto;
	private Carrinho itemvenda = new Carrinho();
	private Estoque estoc ;
	public Venda(Funcionario func ,List<Produto> listaProduto,Estoque estc){
		this.listaProduto = listaProduto;
		this.funcio = func.getNome();
		this.estoc = estc;
		
	}
	public void adicionarCliente(Cliente client){
		this.cliente = client.getNome();
	}
	public String getCliente() {
		return cliente;
	}
	public String getFuncio() {
		return funcio;
	}
	
	public void adicionarProduto(int cod,int quant){
		for(Produto pro:this.listaProduto){
			if(pro.getCodgo() == cod){
				if(quant == 1){
					itemvenda.adicionarProduto(pro);
				}
				else{
					itemvenda.adicionarProduto(pro, quant);
				}
			}
		}
		
	}
	public void removerProduto(int cod ,int quant){
		Iterator<Item> prods = itemvenda.listaProdutos();
	     while(prods.hasNext()){
	    	 Produto prod = prods.next().produto;
	    	 if(prod.getCodgo() == cod){
	    		 itemvenda.removerProduto(prod, quant);
	    	 }
	     }
	}
	public double valorTotalvenda(){
		return itemvenda.total();
	}
	public String finalizarvenda(Pagamento pag){
		Iterator<Item> itens = itemvenda.listaProdutos();
		Item item = null;
	     while(itens.hasNext()){
	    	 item = itens.next();
	    	 estoc.retirar(item.produto, item.quantidade); 
	     }
		StringBuffer cupom = new StringBuffer();
		cupom.append("                   Cupom Fiscal");
		cupom.append("\n Funcionario: "+funcio);
		cupom.append("\n Cliente: " );
		cupom.append("\n Desc.      Qntd.      Val.unit.     Val.total");
		cupom.append("\n "+itemvenda.toString());
		cupom.append("                      Valor da Compra: R$"+itemvenda.total()+"\n");
		cupom.append(pag.finalizarPagamento());
		return cupom.toString();
	}

}
