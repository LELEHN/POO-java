package POO;

public class Livro {
	
	//Public vs private
	
	private String nome;
	
	private String autor;
	
	private int anoPublic;
	
	private int paginas;
	
	public Livro(String nome, String autor, int anoPublic, int paginas){
		
		this.nome = nome;
		
		this.autor = autor;
		
		this.anoPublic = anoPublic;
		
		this.paginas = paginas;
	}
	
	public String showInfo() {
		
		String info = String.format("\nNome: %s\n"
				+ "Autor: %s\n"
				+ "Ano de publicação: %d\n"
				+ "Numero de paginas: %d\n", nome, autor, anoPublic, paginas);
		
		return info; 
	}
	
	
}
