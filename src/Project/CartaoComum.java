package Project;

public class CartaoComum extends Cartao{

	
	public CartaoComum(int id, int senha, String titular) {
		super(id, senha, titular);
		this.limite = 1000.00;
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
		if(senha == this.senha && this.bloqueado == false) {
			if( (this.fatura + produto.getValor()) > this.limite ){
				System.out.println("[!] Sem limite!");
				return false;
			}
			this.fatura += produto.getValor();
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "CartaoComum ID:"+ id +" Titular: "+ titular + " Fatura: "+fatura ;
	}

	
	
}
