package br.com.ProjetoEstabelecimento.Estabelecimento;

import br.com.ProjetoEstabelecimento.Cadastro.Funcionario;
import br.com.ProjetoEstabelecimento.Cadastro.Vendedor;
import br.com.ProjetoEstabelecimento.Estoque.Estoque;
import br.com.ProjetoEstabelecimento.Estoque.EstoqueProduto;
import br.com.ProjetoEstabelecimento.Produto.ProdutoCadastrado;
import br.com.ProjetoEstabelecimento.Produto.Produto;
import br.com.ProjetoEstabelecimento.Vendas.Venda;

public class Movimentacao {
	private ProdutoCadastrado cadastroProdut = new ProdutoCadastrado();
	private Estoque estoque = new Estoque();
	
	
	        //      Cadastro do Produto \\\
	public void cadastraProduto(String descricao,double valor){
		cadastroProdut.addProduto(new Produto(descricao,valor));
	}
	public Produto identificarProdutoCadastrado(String s){
		return cadastroProdut.retorP(s);
	}
    public void alterarCadastro(String a,String b){
		cadastroProdut.alterarDescricao(a, b);
	}
    public void prodCadastrado(){
    	System.out.println(cadastroProdut.produtoCadastrado());
    }
	
	
	         /// Movimentacao do Estoque \\\\
	public void adicionarProdtEstoque(Produto p,int quant){
		estoque.estocar(p, quant);
		System.out.println(estoque.toString());
	}
	public void retirarProdoEstoque(Produto p,int quant){
		estoque.retirar(p, quant);
		System.out.println(estoque.toString());// retirar cod
	}
	public String estoque(){
		return estoque.toString();
	}
	
	
	            ///    Venda    \\\
	public Venda novaVenda(String nomeFunci){
		return new Venda(new Vendedor(nomeFunci), cadastroProdut.produtosCadastrado(),estoque);
	}
	
	

}
