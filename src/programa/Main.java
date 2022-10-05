package programa;

import entidade.Colection;
import entidade.Lista;

public class Main {
    public static void main(String[] args) {
        Lista l = new Lista();
        Colection c = new Colection("gitHub", "https://github.com/");
        Colection c2 = new Colection("google", "https://www.google.com/");
        Colection c3 = new Colection("youtube", "https://www.youtube.com/");

        l.add(c);
        l.add(c2);
        l.add(c3);
        l.buscaLinkDoSite("youtube");
        l.buscaLinkDoSite("google");
        l.buscaLinkDoSite("google");
        l.printList();
    }
}