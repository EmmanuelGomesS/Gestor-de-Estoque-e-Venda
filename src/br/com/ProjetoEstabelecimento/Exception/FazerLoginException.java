package br.com.ProjetoEstabelecimento.Exception;

import java.io.Serializable;

public class FazerLoginException extends Exception implements Serializable{
	
	public FazerLoginException(){
		super("Senha ou ID Invalido");
	}

}
