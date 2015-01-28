package br.com.exercicioc.principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int codigo = 1;
		ArrayList<Item> itens = new ArrayList<Item>();
		Item item;
		boolean continuar = true;
		
		System.out.println("Digite a mensagem de boas vindas: ");
		String mensagem = entrada.nextLine();
		
		Dialogo dialogo = new Dialogo(entrada, mensagem);
		
		dialogo.boasVindas();
				

		while (continuar) {
			codigo = dialogo.lerCodigo();

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
				dialogo.codigoInvalido();
				continue;
			}
			
			item.setTitulo(dialogo.lerTitulo());
			item.setAutor(dialogo.lerAutor());
			item.setDescricao(dialogo.lerDescricao());
			item.setQuantidade(dialogo.lerQuantidade());
			item.setPreco(dialogo.lerPreco());			
									
			itens.add(item);
			
			continuar = dialogo.continuar();
		}		
		
		System.out.println();
		System.out.println("--------------------- ITENS -----------------------------");
		
		for(Item i: itens){
			
			System.out.println("Título: " + i.getTitulo());
			System.out.println("Autor: " + i.getAutor());
			System.out.println("Descricao: " + i.getDescricao());
			System.out.println("Quantidade: " + i.getQuantidade());
			System.out.println("Preço: " + i.getPreco());
			System.out.println("Preço com Desconto: " + i.getPrecoComDesconto());
			System.out.println("--------------------------------------------------");
		}
	}

}
