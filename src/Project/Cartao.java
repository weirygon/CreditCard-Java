package Project;

public abstract class Cartao {
	
	protected int id;
	protected int senha;
	protected String titular;
	protected double limite;
	protected double fatura;
	protected boolean bloqueado;
	
	public Cartao(int id, int senha, String titular) {
		this.id = id;
		this.senha = senha;
		this.titular = titular;
		this.fatura = 0.00;
		this.bloqueado = false;
	}

	public abstract boolean bloquearCartao(int senha);
	
	public abstract boolean desbloquearCartao(int senha);
	
	public abstract boolean ralizarCompras(Produto produto, int senha);
}
