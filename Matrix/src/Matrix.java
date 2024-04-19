public class Matrix {
    static int rows = 8;
    static int columns = 8;

    public static void main(String[] args) {

        for (int i = 1; i <= rows; i++) {
            char a = 65;
            for (int j = 1; j <= columns; j++) {
                System.out.print(i + "" + a + " ");
                a++;

            }
            System.out.println();
        }
    }
}
