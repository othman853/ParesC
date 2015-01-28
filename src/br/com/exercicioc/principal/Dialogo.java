package br.com.exercicioc.principal;

import java.util.Scanner;

public class Dialogo {	
	
	private Scanner leitor;
	private String mensagemDeBoasVindas;

	public Dialogo(Scanner leitor, String mensagemDeBoasVindas){
		this.leitor = leitor;
		this.mensagemDeBoasVindas = mensagemDeBoasVindas;
	}
	
	public void boasVindas(){
		System.out.println(mensagemDeBoasVindas);
	}
	
	public boolean continuar(){
		String resposta;
		leitor.nextLine();
		
		System.out.print("Digite 's' para continuar: ");
		resposta = leitor.nextLine().toLowerCase();
		
		return resposta.equals("s");		
	}
	
	public int lerCodigo(){
		int codigo = 0;		
		
		System.out.print("Código: ");
		codigo = leitor.nextInt();
		
		return codigo;
	}
	
	public String lerAutor(){
		String autor = "";
		leitor.nextLine();
		
		System.out.print("Autor: ");
		autor = leitor.nextLine();
		
		return autor;
	}
	
}
