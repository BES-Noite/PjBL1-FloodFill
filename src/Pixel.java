package src;

public class Pixel {
    private int posX;
    private int posY;
    private int color;

    public Pixel(int posX, int posY, int color) {
        this.posX = posX;
        this.posY = posY;
        this.color = color;
    }

    public void PaintPixel(int[][] matrix, int posX, int posY) {
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

    public boolean checkBoundaries(int posX, int posY) {
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
