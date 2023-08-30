package src;

public interface InterfaceNode {
    Node push(Pixel pixel);
    Pixel pop();
    void enqueue(Pixel pixel);
    Pixel dequeue();
    boolean isEmpty();
    void showList();
}
