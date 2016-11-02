package br.com.ProjetoEstabelecimento.Cadastro;

public class Gerente extends Funcionario {
	private String cargo;
	public Gerente(String nome, String telefone, String endereco, String ID,
			String Senha) {
		super(nome, telefone, endereco, ID, Senha);
		this.cargo = "Gerente";
	}
        public String getCargo() {
		return cargo;
	}

}
