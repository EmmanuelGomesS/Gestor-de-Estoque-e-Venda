package br.com.ProjetoEstabelecimento.Vendas;

public class Dinheiro extends Pagamento{
	private double valortotal;
	private double pagamento;
	private double desconto = 0.05;
	private double troco;
	public Dinheiro(double valortotal,double pagamento){
		this.valortotal= valortotal;
		this.pagamento = pagamento;
		this.desconto *= valortotal;
	}
	public double pagamento(){
		return pagamento;
	}
	public double desconto(){
		return desconto;
	}
	public double pagamentoDesnc0nto(){
		valortotal-=desconto;
		return valortotal;
	}
	public boolean passou(){
		boolean aprovar = false;
		if(pagamento == valortotal){
			aprovar =true;
		}
		else if(pagamento<valortotal){
			aprovar = false;
		}
		else if(pagamento >valortotal){
			aprovar = true;
		}
	   return aprovar;
	}
	public double troco(){
		troco = 0;
		if(pagamento >valortotal){
			troco =pagamento - (valortotal-desconto);
		}
		return troco;
	}
	
	public String finalizarPagamento() {
		StringBuffer pagamento = new StringBuffer();
		pagamento.append("\n tip.Pag.     val.Com desc.      Desc");
		pagamento.append("\n Dinheiro       R$"+pagamentoDesnc0nto()+"         R$"+desconto());		
		
		return pagamento.toString();
	}

}
