package src;

public class Node implements InterfaceNode {
    // Estrutura da lista, aponta para um próximo nó
    // e guarda um Pixel

    private Node next = null;
    private Pixel pixel;

    public Node(Pixel pixel) {

        // cria uma lista
        this.pixel = pixel;
    }
    public Node() {

        // cria uma lista
        pixel = null;
    }

    public Node insertStack(Node linkedList, Pixel pixel) {
        // Insere um pixel na primeira posição da lista (pilha)
        if (linkedList.getPixel() == null) {
            return linkedList = new Node(pixel);
        }

        Node newNode = new Node(pixel);
        newNode.setNext(linkedList);
        return newNode;
    }

    public void insertQueue(Node linkedList, Pixel pixel) {

        // Insere um pixel na lista na próxima posição livre (Fila)

        if (linkedList.getPixel() == null) {
            linkedList.setPixel(pixel);
        }


        //TODO aqui pode conter algum erro, revisar
        else {
            Node newNode = new Node(pixel);
            Node head = linkedList;
            while (head.getNext() != null) {
                head.setNext(head.getNext());
            }
            head.setNext(newNode);
        }

    }

    public void showList(Node linkedList) {

        // Mostra a lista no console

        while (linkedList != null) {
            System.out.println(
                    "X:" + linkedList.pixel.getPosX() + " Y:" + linkedList.pixel.getPosY() + " color:" + linkedList.pixel.getColor());
            linkedList = linkedList.next;
        }
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Pixel getPixel() {
        return pixel;
    }

    public void setPixel(Pixel pixel) {
        this.pixel = pixel;
    }
}
