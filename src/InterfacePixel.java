package src;

public interface InterfacePixel {
    void PaintPixel(int[][] matrix, int posX, int posY);
    boolean checkBoundaries(int posX, int posY);
}
