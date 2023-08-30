package src;

public class Node implements InterfaceNode {
    private Node next = null;
    private Pixel pixel;

    public Node(Pixel pixel) {
        this.pixel = pixel;
    }

    public Node() {
        pixel = null;
    }

    @Override
    public Node push(Pixel pixel) {
        Node newNode = new Node(pixel);
        newNode.next = this;
        return newNode; // Atualiza a referência para o novo nó
    }

    @Override
    public Pixel pop() {
        if (isEmpty()) {
            return null;
        }

        Pixel poppedPixel = this.pixel;
        if (this.next != null) {
            this.pixel = this.next.pixel;
            this.next = this.next.next;
        } else {
            this.pixel = null;
        }
        return poppedPixel;
    }


    @Override
    public void enqueue(Pixel pixel) {
        Node newNode = new Node(pixel);

        if (this.pixel == null) {
            this.pixel = pixel;
        } else {
            Node head = this;
            while (head.next != null) {
                head = head.next;
            }
            head.next = newNode;
        }
    }

    @Override
    public Pixel dequeue() {
        if (isEmpty()) {
            return null;
        }

        Pixel dequeuedPixel = this.pixel;
        this.pixel = null;
        return dequeuedPixel;
    }


    @Override
    public boolean isEmpty() {
        return this.pixel == null;
    }

    @Override
    public void showList() {
        Node currentNode = this;

        while (currentNode != null) {
            System.out.println(
                    "X:" + currentNode.pixel.getPosX() + " Y:" + currentNode.pixel.getPosY() + " color:" + currentNode.pixel.getColor());
            currentNode = currentNode.next;
        }
    }
}
