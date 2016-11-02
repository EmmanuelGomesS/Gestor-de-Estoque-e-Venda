package br.com.ProjetoEstabelecimento.Cadastro;

public abstract class Funcionario extends Pessoa{
	private String ID;
	private String Senha;
    private int matricula;
    public Funcionario(String nome, String telefone, String endereco,String ID,String Senha) {
		super(nome, telefone, endereco);
		this.ID = ID;
		this.Senha =Senha;
		++matricula;		
	}
  
	public String getID() {
		return ID;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		this.Senha = senha;
	}    
	public int getMatricula() {
		return matricula;
	}
	
	public abstract String getCargo() ;

}
