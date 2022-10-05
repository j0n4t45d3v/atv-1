package entidade;

public class Lista {
    private Node head;
    private Node tail;

    public Lista() {
        this.head = null;
        this.tail = null;
    }

    public void add(Colection value){
        Node node = new Node(value);
        if(this.head == null){
            this.head = node;
        }else{
            this.tail.setNext(node);
        }
        this.tail = node;
    }

    public void buscaLinkDoSite(String nomeDoSite){
        Node p = this.head;
        Node ant = null;
        boolean a = false;

        while(p != null){
            if(nomeDoSite.equalsIgnoreCase(p.getValue().getNomeSite())){
                System.out.println(p.getValue().getLinkSite());
                    if(p.equals(this.head)){
                        break;
                    }else if(p.equals(this.tail)){
                        p.setNext(this.head);
                        this.tail = ant;
                        ant.setNext(null);
                    }else{
                        ant.setNext(p.getNext());
                        p.setNext(this.head);
                    }
                    a = true;
                    this.head = p;
                break;
            }
            ant = p;
            p = p.getNext();
        }
        if(!a){
            System.out.println("O site digitado não foi encontrado!");
        }
    }

    public void printList(){
        Node p = this.head;

        while(p != null){
            System.out.println(p.getValue().getNomeSite()+" link do site "+p.getValue().getLinkSite());
            p = p.getNext();
        }
    }

}
