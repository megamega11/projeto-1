package curso.Nelio.OO;


import java.util.Set;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		
		return nome;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return preco;
	}
}
