package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome, autor;
		
		int anoPublic, paginas, resposta = -1;
		
		ArrayList<Livro> livroList = new ArrayList<>();
		
		
		while(resposta != 3) {
			
			System.out.println("Hello you!\n"
					+ "O que você quer fazer?\n"
					+ "1 - Adicionar um novo livro\n"
					+ "2 - Mostrar livros\n"
					+ "3 - Sair");
			
			resposta = scan.nextInt();
			scan.nextLine();
			
			switch(resposta) {
			
			case 1:
				
				System.out.println("Qual é o nome do livro?");
				
				nome = scan.nextLine();
				
				System.out.println("Qual é o nome do autor?");
				
				autor = scan.nextLine();
				
				System.out.println("Qual é o ano de publicação?");
				
				anoPublic = scan.nextInt();
				
				System.out.println("Qual é o numero de paginas?");
				
				paginas = scan.nextInt();
				
				Livro novoLivro = new Livro(nome, autor, anoPublic, paginas);
				
				livroList.add(novoLivro);
				
				break;
				
			case 2:
				
				 for(int i = 0; i < livroList.size(); i ++) {
					 
					 System.out.println(livroList.get(i).showInfo());
				 }
				
				break;
				
			case 3:
				
				break;
			}
		}
		
	}
	
}
