package br.com.ProjetoEstabelecimento.Estabelecimento;

import java.util.ArrayList;
import java.util.List;
import br.com.ProjetoEstabelecimento.Cadastro.Pessoa;
import br.com.ProjetoEstabelecimento.Cadastro.Cliente;
import br.com.ProjetoEstabelecimento.Cadastro.Funcionario;
import br.com.ProjetoEstabelecimento.Cadastro.Gerente;
import br.com.ProjetoEstabelecimento.Cadastro.Vendedor;
import br.com.ProjetoEstabelecimento.Exception.FazerLoginException;


public class Estabelecimento {
	private Movimentacao movimentar = new Movimentacao();
	private List<Pessoa> cliente = new ArrayList<Pessoa>();
	private List<Funcionario> funcionario = new ArrayList<Funcionario>();

	public Movimentacao getMovimentar() {
		return movimentar;
	}
	           ///   Cadastro Cliente \\\
	public void cadastroCliente(String nome,String telefone,String endereco){
		this.cliente.add(new Cliente(nome, telefone, endereco));
	}
	public Pessoa idCliente(String nome){
		for(Pessoa c :this.cliente){
			if(c.getNome().equals(nome)){
				return c;
			}
		}
		return null;
	}
	
	
	            /// Cadastro Funcionario \\\\
	public void cadastroFuncionario(String nome, String telefone, String endereco, String ID,
			String senha,int tipo){
		if(tipo == 1){
			this.funcionario.add(new Gerente(nome,telefone,endereco,ID,senha));
		}
		else if(tipo == 2){
			this.funcionario.add(new Vendedor(nome,telefone,endereco,ID,senha));
		}
	}
	                /// Login Funcionario \\\\
     public Funcionario fazerLogin(String l,String s) throws FazerLoginException {
		     for(int i = 0;i<funcionario.size();i++){
			      Funcionario c = funcionario.get(i);
			      String login = c.getID();
			      if(login.equals(l)){
				     String senha = c.getSenha();
				        if(senha.equals(s)){
					          return c;
				          }
			       }
		       }
		throw new FazerLoginException();
	 }
     
     
}
