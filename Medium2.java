import java.util.Scanner;

class Medium2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input n: ");
        int rows = scanner.nextInt();
        if (rows % 2 == 0) rows++;
        int cols = rows;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (
                    (r == 0 || r == rows - 1) ||
                    (c == rows - r - 1)
                ) {
                    System.out.print("z");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}