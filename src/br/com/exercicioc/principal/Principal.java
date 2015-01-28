package br.com.exercicioc.principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int codigo = 1;
		ArrayList<Item> itens = new ArrayList<Item>();
		Item item;
		
		System.out.println("Digite a mensagem de boas vindas: ");
		String mensagem = entrada.nextLine();
		
		Dialogo dialogo = new Dialogo(entrada, mensagem);

		dialogo.boasVindas();
		System.out.println("Código ---- Item");
		System.out.println("1 --------- Livro");
		System.out.println("2 --------- Mídia");
		System.out.println("3 --------- Revista");
		System.out.println("0 --------- Sair");

		while (codigo != 0) {

			System.out.println("Cadastre o item...");

			System.out.print("Digite o código do item ou 0 para sair: ");
			try {
				codigo = entrada.nextInt();
			} catch (Exception ex) {
				System.out.println("Código inválido.");
			}

			switch (codigo) {
			case 1:
				item = new Livro();
				break;
			case 2: 
				item = new Midia();
				break;
			case 3:
				item = new Revista();
				break;
			case 4:
				item = new Revista();
				break;
				
				
			default:
				continue;
			}
			
			entrada.nextLine();
			System.out.print("Título: ");
			item.setTitulo(entrada.nextLine());

			System.out.print("Autor: ");

			item.setAutor(entrada.nextLine());

			System.out.print("Descrição: ");

			item.setDescricao(entrada.nextLine());

			System.out.print("Quantidade: ");
			try {
				item.setQuantidade(entrada.nextInt());
			} catch (Exception ex) {
				System.out.println("Quantidade inválida.");
			}

			System.out.println("Preço: ");
			try {
				item.setPreco(entrada.nextDouble());
			} catch (Exception ex) {
				System.out.println("Preço inválido.");
			}
									
			itens.add(item);
		}
		
		
		for(Item i: itens){
			
			System.out.println("Título: " + i.getTitulo());
			System.out.println("Autor: " + i.getAutor());
			System.out.println("Descricao: " + i.getDescricao());
			System.out.println("Quantidade: " + i.getQuantidade());
			System.out.println("Preço: " + i.getPreco());
			System.out.println("Preço com Desconto: " + i.getPrecoComDesconto());
		}
	}

}
