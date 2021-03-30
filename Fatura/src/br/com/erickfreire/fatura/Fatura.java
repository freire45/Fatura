package br.com.erickfreire.fatura;

/**
 * Crie um programa em Java que simula uma fatura
 * @author Erick Freire
 * @version 1 - Criado em 30-03-2021
 */

public class Fatura {
	String numero;
	String descricao;
	int quantidade;
	double preco;
	
	public Fatura(String n, String descri, int qtd, double pco) {
		
		this.numero = n;
		this.descricao = descri;
		this.quantidade = qtd;
		this.preco = pco;
		
	}
	
	public void setNumero(String num) {
		this.numero = num;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setDescricao(String desc) {
		this.descricao = desc;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setQuantidade(int qtdade) {
		this.quantidade = qtdade;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setPreco(double p) {
		this.preco = p;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public double getValorFatura() {
		if(quantidade < 0)
			quantidade = 0;
		if(preco < 0)
			preco = 0;
		
		double calculo = quantidade * preco;
		return calculo;
	}

}
