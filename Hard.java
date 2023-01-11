import java.util.Scanner;

class Hard {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("String: ");
        String orig = scanner.nextLine();
        int size = orig.length();

        int samples = size * (1 + (size - 2));

        System.out.println();
        System.out.println("All patterns of " + orig + ": " + samples);
        String modWord = orig;
        for (int i = 1; i <= size; i++) {
            System.out.println(modWord);
            for (int j = 1; j < size - 1; j++) {
                modWord = moveToLast(modWord, 1);       
                System.out.println(modWord);
            }
            if (i == size) break;
            modWord = moveToFirst(orig, i);
        }
        // code 1 1
        // cdeo 1 2
        // cdoe 
        
    }

    public static String moveToFirst(String word, int index) {
        char charToMove = word.charAt(index);
        String newWord = "" + charToMove;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != charToMove) newWord += word.charAt(i);    
        }        
        return newWord;
    }

    public static String moveToLast(String word, int index) {
        char charToMove = word.charAt(index);
        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            if (i != index) newWord += word.charAt(i);    
        }        
        return newWord += charToMove;
    }
}