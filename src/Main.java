package src;

public class Main {

    public static void main(String[] args) {
        final int[][] array = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 0, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 1, 1, 1, 1, 1, 1},
                {1, 1, 0, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };
        int startX = 0; // Posição inicial X
        int startY = 0; // Posição inicial Y
        int newColor = 2; // Nova cor para preenchimento

        // Usa a função floodFill com pilha
        int[][] filledArrayUsingStack = new int[array.length][array[0].length];
        copyArray(array, filledArrayUsingStack);
        floodFill(filledArrayUsingStack, startX, startY, newColor, true);
        System.out.println("Resultado usando pilha:");
        printMatrix(filledArrayUsingStack);

        // Usa a função floodFill com fila
        int[][] filledArrayUsingQueue = new int[array.length][array[0].length];
        copyArray(array, filledArrayUsingQueue);
        floodFill(filledArrayUsingQueue, startX, startY, newColor, false);
        System.out.println("Resultado usando fila:");
        printMatrix(filledArrayUsingQueue);
    }

    public static void floodFill(int[][] matrix, int startX, int startY, int newColor, boolean useStack) {
        int originalColor = matrix[startX][startY];
        if (originalColor == newColor) {
            return;
        }

        InterfaceNode dataStructure;

        if (useStack) {
            dataStructure = new Node(); // Usa pilha
        } else {
            dataStructure = new Node(); // Usa fila
        }

        dataStructure.enqueue(new Pixel(startX, startY, originalColor));

        while (!dataStructure.isEmpty()) {
            Pixel currentPixel = dataStructure.dequeue();

            if(currentPixel != null) {

                int x = currentPixel.getPosX();
                int y = currentPixel.getPosY();

                if (matrix[x][y] == originalColor) {
                    matrix[x][y] = newColor;

                    // Adiciona vizinhos à pilha ou fila
                    if (x + 1 < matrix.length) dataStructure.enqueue(new Pixel(x + 1, y, originalColor)); // Direita
                    if (x - 1 >= 0) dataStructure.enqueue(new Pixel(x - 1, y, originalColor)); // Esquerda
                    if (y + 1 < matrix[x].length) dataStructure.enqueue(new Pixel(x, y + 1, originalColor)); // Baixo
                    if (y - 1 >= 0) dataStructure.enqueue(new Pixel(x, y - 1, originalColor)); // Cima
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void copyArray(int[][] source, int[][] destination) {
        for (int i = 0; i < source.length; i++) {
            System.arraycopy(source[i], 0, destination[i], 0, source[i].length);
        }
    }
}
