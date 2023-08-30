package src;

import static src.FloodFill.floodFill;
import static src.Matrix.*;

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
        int startX = 3; // Posição inicial X
        int startY = 9; // Posição inicial Y
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
}

