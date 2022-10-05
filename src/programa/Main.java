package programa;

import entidade.Colection;
import entidade.Lista;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lista l = new Lista();
        Colection c = new Colection("gitHub", "https://github.com/");
        Colection c2 = new Colection("google", "https://www.google.com/");
        Colection c3 = new Colection("youtube", "https://www.youtube.com/");
        Colection c4 = new Colection("Instagram", "https://www.instagram.com/");
        Colection c5 = new Colection("Facebook", "https://www.facebook.com/");

        l.add(c);
        l.add(c2);
        l.add(c3);
        l.add(c4);
        l.add(c5);

        starProgram(l);

    }

    private static void starProgram(Lista l) {
        Scanner s = new Scanner(System.in);

        int p;
        do{
            System.out.print("Escolha uma opção. 0-Sair do programa, 1-Retorna o link do site, 2-Imprimi a lista: ");
            p = s.nextInt();
            switch (p) {
                case 0 -> System.out.println("Programa encerrado!");
                case 1 -> {
                    System.out.print("Digite o nome do site que deseja encontrar o link: ");
                    String nomeSite = s.next();
                    l.buscaLinkDoSite(nomeSite);
                }
                case 2 -> l.printList();
                default -> System.out.println("Não existe essa opção!");
            }
        }while (p != 0);
    }

}