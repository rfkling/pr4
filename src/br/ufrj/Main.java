package br.ufrj;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No no=null;
		Arvore arvore = new Arvore();
		Scanner in = new Scanner(System.in);
		for(int i=0; i<5; i++)
		 {
		 System.out.println("Entre com um valor: ");
		 no = arvore.insere(no, in.nextInt());
		 }
		 in.close();
		 System.out.println(arvore.toString(no));
	}

}
