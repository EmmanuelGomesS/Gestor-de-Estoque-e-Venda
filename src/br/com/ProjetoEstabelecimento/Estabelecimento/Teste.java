package br.com.ProjetoEstabelecimento.Estabelecimento;

import javax.swing.JOptionPane;

import br.com.ProjetoEstabelecimento.Cadastro.Pessoa;
import br.com.ProjetoEstabelecimento.Produto.ProdutoCadastrado;
import br.com.ProjetoEstabelecimento.Produto.Produto;
import br.com.ProjetoEstabelecimento.Vendas.Dinheiro;
import br.com.ProjetoEstabelecimento.Vendas.Pagamento;
import br.com.ProjetoEstabelecimento.Vendas.Venda;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Estabelecimento e = new Estabelecimento();
		e.getMovimentar().cadastraProduto("Geladeira", 700);
		e.getMovimentar().cadastraProduto("Televisao", 900);
		Produto a = e.getMovimentar().identificarProdutoCadastrado("Geladeira");
		Produto b = e.getMovimentar().identificarProdutoCadastrado("Televisao");
		e.cadastroCliente("Jabes", "2233", "Av. Brasil");
		Pessoa c = e.idCliente("Jabes");
		e.getMovimentar().adicionarProdtEstoque(a, 3);
		e.getMovimentar().adicionarProdtEstoque(b, 5);
		e.getMovimentar().retirarProdoEstoque(a, 2);
		e.getMovimentar().adicionarProdtEstoque(a, 4);
		///System.out.println("Estoque disponivel: "+e.getMovimentar().verificardisponibilidadeEstoque("Geladeira"));
						
		e.getMovimentar().prodCadastrado();
		Venda venda = e.getMovimentar().novaVenda("Jabes");
		venda.adicionarProduto(1, 2);
		venda.adicionarProduto(2, 2);
		Pagamento pag = new Dinheiro(venda.valorTotalvenda(), 4000);
		JOptionPane.showMessageDialog(null, venda.finalizarvenda(pag));

		System.out.println(e.getMovimentar().estoque());
		Venda venda2 = e.getMovimentar().novaVenda("Jabes");
		venda2.adicionarProduto(1, 2);
		venda2.adicionarProduto(2, 2);
		Pagamento pag1 = new Dinheiro(venda.valorTotalvenda(), 5000);

		JOptionPane.showMessageDialog(null, venda2.finalizarvenda(pag1));
		System.out.println(e.getMovimentar().estoque());
		
		
		
		

	}

}
