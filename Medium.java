import java.util.Scanner;

class Medium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int rows = scanner.nextInt();
        int cols = rows + (2 + rows - 3);
        int middle = (cols / 2) + 1;
        
        System.out.println();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (
                    (r == rows - 1) || 
                    ((c + r + 1) == middle || (c - r + 1) == middle)
                ) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}