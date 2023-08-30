package src;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class FloodFill {

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
}