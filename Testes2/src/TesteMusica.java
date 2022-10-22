import java.util.Scanner;

public class TesteMusica {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
    
	Musica obj1 = new Musica();
    
    System.out.println("Digite o título da música: ");
    obj1.setTitulo(leia.nextLine());
    System.out.println("Digite o nome do artista: ");
    obj1.setArtista(leia.nextLine());
    System.out.println("Digite o nome do álbum: ");
    obj1.setAlbum(leia.nextLine());
    System.out.println("Digite o ano de lançamento: ");
    obj1.setAno(leia.nextInt());
    System.out.println("Digite o ranking: ");
    obj1.setRanking(leia.nextInt());
    System.out.println("Digite a duraçao da música: ");
    obj1.setDuracao(leia.nextDouble());
    
    
    System.out.println("Título: " + obj1.getTitulo());
    System.out.println("Artista: " + obj1.getArtista());
    System.out.println("Álbum: " + obj1.getAlbum());
    System.out.println("Ano de lançamento: " + obj1.getAno());
    System.out.println("Ranking: " + obj1.getRanking());
    System.out.println("Duração: " + obj1.getDuracao());
    
    Musica obj2 = new Musica();
    
    
    System.out.println("Digite o título da música: ");
    leia.nextLine();
    obj2.setTitulo(leia.nextLine());
    System.out.println("Digite o nome do artista: ");
    obj2.setArtista(leia.nextLine());
    System.out.println("Digite o nome do álbum: ");
    obj2.setAlbum(leia.nextLine());
    System.out.println("Digite o ano de lançamento: ");
    obj2.setAno(leia.nextInt());
    System.out.println("Digite o ranking: ");
    obj2.setRanking(leia.nextInt());
    System.out.println("Digite a duraçao da música: ");
    obj2.setDuracao(leia.nextDouble());
    
    
    System.out.println("Título: " + obj2.getTitulo());
    System.out.println("Artista: " + obj2.getArtista());
    System.out.println("Álbum: " + obj2.getAlbum());
    System.out.println("Ano de lançamento: " + obj2.getAno());
    System.out.println("Ranking: " + obj2.getRanking());
    System.out.println("Duração: " + obj2.getDuracao());
	
	Musica obj3 = new Musica("[ Santo ]","[ Jão ]", "[ Pirata ]", 2021 , 1, 3.33);
    
	System.out.println(obj3);
}
}
