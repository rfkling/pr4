package br.ufrj;

public class No {
	private int valor;
	private No direita, esquerda;
	public int getValor() { return valor; }
	public void setValor(int valor) { this.valor = valor; }
	public No getDireita() { return direita; }
	public void setDireita(No direita) { this.direita = direita; }
	public No getEsquerda() { return esquerda; }
	public void setEsquerda(No esquerda) { this.esquerda = esquerda; }
}
