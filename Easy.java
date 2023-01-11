import java.util.Scanner;

class Easy {    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of integers: ");
        int qty = scanner.nextInt();
        int data[] = new int[qty];

        System.out.print("Enter numbers: ");
        for (int i = 0; i < qty; i++) {
            data[i] = scanner.nextInt();
        }

        double median = 0;
        
        for (int i = 0; i < qty; i++) {
            for (int j = i + 1; j < qty; j++) {
                int temp = 0;
                if (data[i] > data[j]) {
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        
        System.out.println();

        if (qty % 2 == 0) {
            double average = (data[(qty / 2) - 1] + data[(qty / 2)]) / 2.0;
            System.out.println("Median: " + average);
        }
        else
        System.out.println("Median: " + (double)(data[qty / 2]));
    }
}