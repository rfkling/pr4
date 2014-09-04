package br.ufrj;

public class Arvore {
	public No insere(No no, int valor)
	{
	if(no == null)
	 {
	 no = new No();
	 no.setValor(valor);
	 }
	 else
	 if(valor > no.getValor())
	 no.setDireita(insere(no.getDireita(), valor));
	 else
	 no.setEsquerda(insere(no.getEsquerda(), valor));
	return no;
	}
	public String toString(No no)
	{
	if(no==null) return "";
	 else 
	 return toString(no.getEsquerda()) + 
	 toString(no.getDireita()) + 
	 no.getValor() + " ";
	}
}
