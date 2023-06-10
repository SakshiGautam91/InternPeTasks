public class NamedLoop {
    public static void main(String[] args) {
        int i, j;
        // outer loop
        outer: 
        for (i = 1; i <= 6; i++) {
            System.out.println();
            // inner loop
            inner: 
            for (j = 1; j <= 10; j++) {
                if (i == 5)
                    break outer;
                System.out.print("Task 3 Named loops\n");
                if (j == 9)
                    break inner;
            }
        }
    }
}
