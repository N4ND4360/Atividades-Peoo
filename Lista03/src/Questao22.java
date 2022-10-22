import java.util.Scanner;
public class Questao22 {
	/* Autora: Fernanda Jamily Aquino Silva*/
	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    int resposta = 0;
    double valorT = 0.0;
    do{
    System.out.println("100 Cachorro quente R$ 1,10");
    System.out.println("101 Bauru simples   R$ 1,30");
    System.out.println("102 Bauru com ovo   R$ 1,50");
    System.out.println("103 Hamburger       R$ 1,10");
    System.out.println("104 Cheeseburger    R$ 1,30");
    System.out.println("105 Refrigerante    R$ 1,00");
    System.out.println("Escolha uma opção: ");
    resposta = leia.nextInt();
    int quantidade = 0;
    double preco = 0.0;
    
    System.out.println("Digite a quantidade: ");
    quantidade = leia.nextInt();
    switch(resposta) {
    case 100:
    preco = quantidade * 1.10;
    valorT = valorT + preco;
    break;
    case 101:
    preco = quantidade * 1.30;
    valorT = valorT + preco;
    break;
    case 102:
    preco = quantidade * 1.50;
    valorT = valorT + preco;
    break;
    case 103:
    preco = quantidade * 1.30;
    valorT = valorT + preco;
    break;	
    case 104:
    preco = quantidade * 1.10;
    valorT = valorT + preco;
    break;
    case 105:
    preco = quantidade * 1.10;
    valorT = valorT + preco;
    break;
    default:
    System.out.println("digite um valor valido!!");
    }    
    System.out.println("Deseja mais alguma coisa? 1 p/ sim  - 1 p/ não");
    resposta = leia.nextInt();
    }while(resposta != -1);
    System.out.println("Valor total: " + valorT);
	}
	}

