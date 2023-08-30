package src;

public interface InterfaceNode {
    Node insertStack(Node linkedList, Pixel pixel);
    Node popStack(Node linkedList);
    void insertQueue(Node linkedList, Pixel pixel);
    Node dequeueQueue(Node linkedList);
    void showList(Node linkedList);
}
