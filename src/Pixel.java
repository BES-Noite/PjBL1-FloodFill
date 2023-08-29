package src;

public class Pixel implements InterfacePixel{

    // Estrutura do pixel, guarda as coordenadas
    // e um int que representa a cor
    private int posX;
    private int posY;
    private int color;

    public Pixel(int posX, int posY, int color) {
        this.posX = posX;
        this.posY = posY;
        this.color = color;
    }

    public static void PaintPixel(int[][] matrix, int posX, int posY) {

        // Preenche o pixel e seus adjacentes por 2

        matrix[posX][posY] = 2;

        if (checkBoundaries(posX + 1, posY) && matrix[posX + 1][posY] == 1) {
            PaintPixel(matrix, (posX + 1), posY);
        }
        if (checkBoundaries(posX - 1, posY) && matrix[posX - 1][posY] == 1) {
            PaintPixel(matrix, (posX - 1), posY);
        }
        if (checkBoundaries(posX, posY + 1) && matrix[posX][posY + 1] == 1) {
            PaintPixel(matrix, posX, (posY + 1));
        }
        if (checkBoundaries(posX, posY - 1) && matrix[posX][posY - 1] == 1) {
            PaintPixel(matrix, posX, (posY - 1));
        }

    }

    public static boolean checkBoundaries(int posX, int posY) {

        // Verifica se o pixel está dentro da dimensão da matriz

        return (posX >= 0 && posX <= 9) && (posY >= 0 && posY <= 9);

    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
