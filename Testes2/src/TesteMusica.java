import java.util.Scanner;

public class TesteMusica {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
    
	Musica obj1 = new Musica();
    
    System.out.println("Digite o t�tulo da m�sica: ");
    obj1.setTitulo(leia.nextLine());
    System.out.println("Digite o nome do artista: ");
    obj1.setArtista(leia.nextLine());
    System.out.println("Digite o nome do �lbum: ");
    obj1.setAlbum(leia.nextLine());
    System.out.println("Digite o ano de lan�amento: ");
    obj1.setAno(leia.nextInt());
    System.out.println("Digite o ranking: ");
    obj1.setRanking(leia.nextInt());
    System.out.println("Digite a dura�ao da m�sica: ");
    obj1.setDuracao(leia.nextDouble());
    
    
    System.out.println("T�tulo: " + obj1.getTitulo());
    System.out.println("Artista: " + obj1.getArtista());
    System.out.println("�lbum: " + obj1.getAlbum());
    System.out.println("Ano de lan�amento: " + obj1.getAno());
    System.out.println("Ranking: " + obj1.getRanking());
    System.out.println("Dura��o: " + obj1.getDuracao());
    
    Musica obj2 = new Musica();
    
    
    System.out.println("Digite o t�tulo da m�sica: ");
    leia.nextLine();
    obj2.setTitulo(leia.nextLine());
    System.out.println("Digite o nome do artista: ");
    obj2.setArtista(leia.nextLine());
    System.out.println("Digite o nome do �lbum: ");
    obj2.setAlbum(leia.nextLine());
    System.out.println("Digite o ano de lan�amento: ");
    obj2.setAno(leia.nextInt());
    System.out.println("Digite o ranking: ");
    obj2.setRanking(leia.nextInt());
    System.out.println("Digite a dura�ao da m�sica: ");
    obj2.setDuracao(leia.nextDouble());
    
    
    System.out.println("T�tulo: " + obj2.getTitulo());
    System.out.println("Artista: " + obj2.getArtista());
    System.out.println("�lbum: " + obj2.getAlbum());
    System.out.println("Ano de lan�amento: " + obj2.getAno());
    System.out.println("Ranking: " + obj2.getRanking());
    System.out.println("Dura��o: " + obj2.getDuracao());
	
	Musica obj3 = new Musica("[ Santo ]","[ J�o ]", "[ Pirata ]", 2021 , 1, 3.33);
    
	System.out.println(obj3);
}
}
