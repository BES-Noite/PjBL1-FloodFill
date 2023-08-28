public interface FloodFillInterface {
    // Definição da interface
    public interface FloodFillInterface {

        Node insertStack(Node linkedList, Pixel pixel);

        void insertQueue(Node linkedList, Pixel pixel);

        void showList(Node linkedList);

        boolean checkBoundaries(int posX, int posY);

        void printMatrix(int[][] matrix);

        void Fill(int[][] matrix, int posX, int posY);
    }

}
