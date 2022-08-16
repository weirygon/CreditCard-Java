package Avaliacao2Weiry;

public class Produto {
	
	private String data;
	private String nome_Produto;
	private double valor;

	public Produto(String data, String nome_Produto, double valor) {
	
		this.data = data;
		this.nome_Produto = nome_Produto;
		this.valor = valor;
	}

	public String getData() {
		return data;
	}

	public String getNome_Produto() {
		return nome_Produto;
	}

	public double getValor() {
		return valor;
	}

	
}
