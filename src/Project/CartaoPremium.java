package Avaliacao2Weiry;

public class CartaoPremium extends Cartao{
	
	private double pontos;

	public CartaoPremium(int id, int senha, String titular) {
		super(id, senha, titular);
		this.pontos = 0.0;
	}

	@Override
	public boolean bloquearCartao(int senha) {
		if(senha == this.senha) {
			//System.out.println("Cartao Bloqueado");
			this.bloqueado = true;
			return true;
		}else {
			//System.out.println("[!] Senha inavlida!");
			return false;
		}
		
	}

	@Override
	public boolean desbloquearCartao(int senha) {
		if(senha == this.senha) {
			//System.out.println("Cartao Desloqueado!");
			this.bloqueado = false;
			return true;
		}else {
			//System.out.println("[!] Senha inavlida!");
			return false;
		}
	}
	@Override
	public boolean ralizarCompras(Produto produto, int senha) {		
		if(senha == this.senha && this.bloqueado == false){
				this.fatura += produto.getValor();
				this.pontos += produto.getValor() / 5;
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "CartaoPremium ID:"+ id +" Titular: "+ titular + " Fatura: "+fatura+" Pontos: "+pontos;
	}
	

}
