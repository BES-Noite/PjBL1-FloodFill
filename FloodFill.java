public class FloodFill {

    private static class Pixel {

        // Estrutura do pixel, guarda as coordenadas
        // e um int que representa a cor

        public int posX;
        public int posY;
        public int color;

        public Pixel(int x, int y, int c) {
            posX = x;
            posY = y;
            color = c;
        }
    }

    private static class Node {

        // Estrutura da lista, aponta para um próximo nó
        // e guarda um Pixel

        public Node next;
        public Pixel pixel;

        public Node(Pixel pixelData) {

            // cria uma lista

            pixel = pixelData;
            next = null;
        }

        public Node() {

            // cria uma lista

            pixel = null;
            next = null;
        }

    }

    public static Node insertStack(Node linkedList, Pixel pixel) {

        // Insere um pixel na primeira posição da lista (pilha)

        if (linkedList.pixel == null) {
            return linkedList = new Node(pixel);
        }

        Node newNode = new Node(pixel);
        newNode.next = linkedList;
        return newNode;

    }

    public static void insertQueue(Node linkedList, Pixel pixel) {

        // Insere um pixel na lista na próxima posição livre (Fila)

        if (linkedList.pixel == null) {
            linkedList.pixel = pixel;
        }

        else {
            Node newNode = new Node(pixel);
            Node head = linkedList;
            while (head.next != null) {
                head = head.next;
            }
            head.next = newNode;
        }

    }

    public static void showList(Node linkedList) {

        // Mostra a lista no console

        while (linkedList != null) {
            System.out.println(
                    "X:" + linkedList.pixel.posX + " Y:" + linkedList.pixel.posY + " color:" + linkedList.pixel.color);
            linkedList = linkedList.next;
        }
    }

    public static boolean checkBoundaries(int posX, int posY) {

        // Verifica se o pixel está dentro da dimensão da matriz

        return (posX >= 0 && posX <= 9) && (posY >= 0 && posY <= 9);

    }

    public static void printMatrix(int[][] matrix) {

        // Mostra a matriz no console

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void Fill(int[][] matrix, int posX, int posY) {

        // Preenche o pixel e seus adjacentes por 2

        matrix[posX][posY] = 2;

        if (checkBoundaries(posX + 1, posY) && matrix[posX + 1][posY] == 1) {
            Fill(matrix, (posX + 1), posY);
        }
        if (checkBoundaries(posX - 1, posY) && matrix[posX - 1][posY] == 1) {
            Fill(matrix, (posX - 1), posY);
        }
        if (checkBoundaries(posX, posY + 1) && matrix[posX][posY + 1] == 1) {
            Fill(matrix, posX, (posY + 1));
        }
        if (checkBoundaries(posX, posY - 1) && matrix[posX][posY - 1] == 1) {
            Fill(matrix, posX, (posY - 1));
        }

    }

}
