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
		
		System.out.println("Código ---- Item");
		System.out.println("1 --------- Livro");
		System.out.println("2 --------- Mídia");
		System.out.println("3 --------- Revista");
		
		System.out.print("Código: ");
		codigo = leitor.nextInt();
		
		return codigo;
	}
	
	public String lerTitulo(){
		String titulo = "";
		System.out.print("Título: ");
		titulo = leitor.next();
		return titulo;		
	}
	
	public String lerDescricao(){
		System.out.print("Descrição: ");
		return leitor.nextLine();
	}
	
	public int lerQuantidade(){
		System.out.print("Quantidade: ");
		return leitor.nextInt();
	}
	
	public double lerPreco(){
		System.out.print("Preço: ");
		return leitor.nextDouble();
	}
	
	public String lerAutor(){
		String autor = "";
		leitor.nextLine();
		
		System.out.print("Autor: ");
		autor = leitor.nextLine();
		
		return autor;
	}

	public void codigoInvalido() {
		System.out.println("Código Inválido.");		
	}
	
}
