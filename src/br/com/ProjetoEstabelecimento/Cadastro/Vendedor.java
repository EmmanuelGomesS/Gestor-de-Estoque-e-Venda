package br.com.ProjetoEstabelecimento.Cadastro;

public class Vendedor extends Funcionario{
	private String cargo;
	public Vendedor(String nome){
		super(nome,null,null,null,null);
	}
	public Vendedor(String nome, String telefone, String endereco, String ID,
			String Senha) {
		super(nome, telefone, endereco, ID, Senha);
		this.cargo = "Vendedor";
	}
       public String getCargo() {
		return cargo;
	}

}
