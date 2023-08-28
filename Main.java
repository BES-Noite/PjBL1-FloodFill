public class Main {
    public static void main(String[] args) {
        final int[][] array = {
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 0, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 0, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 0, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 0, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 0, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
        };

        Pixel pixel1 = new Pixel(1, 1, 1);
        Pixel pixel2 = new Pixel(2, 2, 2);
        Pixel pixel3 = new Pixel(3, 3, 3);

        Node list2 = new Node();

        // insertQueue(list2, pixel1);
        // insertQueue(list2, pixel2);
        // insertQueue(list2, pixel3);

        list2 = insertStack(list2, pixel1);
        list2 = insertStack(list2, pixel2);
        list2 = insertStack(list2, pixel3);

        Node list = new Node(pixel2);

        showList(list);
        printMatrix(array);
        Fill(array, 0, 0);
        printMatrix(array);
        showList(list2);

    }

}

