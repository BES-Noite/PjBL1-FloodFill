package src;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

        if (useStack) {
            Stack<int[]> stack = new Stack<>();
            stack.push(new int[]{startX, startY});

            while (!stack.isEmpty()) {
                int[] currentPixel = stack.pop();
                int x = currentPixel[0];
                int y = currentPixel[1];

                if (matrix[x][y] == originalColor) {
                    matrix[x][y] = newColor;

                    // Adiciona vizinhos à pilha nas direções horizontais e verticais
                    if (x + 1 < matrix.length) stack.push(new int[]{x + 1, y}); // Direita
                    if (x - 1 >= 0) stack.push(new int[]{x - 1, y}); // Esquerda
                    if (y + 1 < matrix[x].length) stack.push(new int[]{x, y + 1}); // Baixo
                    if (y - 1 >= 0) stack.push(new int[]{x, y - 1}); // Cima
                }
            }
        } else {
            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{startX, startY});

            while (!queue.isEmpty()) {
                int[] currentPixel = queue.poll();
                int x = currentPixel[0];
                int y = currentPixel[1];

                if (matrix[x][y] == originalColor) {
                    matrix[x][y] = newColor;

                    // Adiciona vizinhos à fila nas direções horizontais e verticais
                    if (x + 1 < matrix.length) queue.offer(new int[]{x + 1, y}); // Direita
                    if (x - 1 >= 0) queue.offer(new int[]{x - 1, y}); // Esquerda
                    if (y + 1 < matrix[x].length) queue.offer(new int[]{x, y + 1}); // Baixo
                    if (y - 1 >= 0) queue.offer(new int[]{x, y - 1}); // Cima
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
