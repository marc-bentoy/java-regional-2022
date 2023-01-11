import java.util.Scanner;

class VeryHard {
    public static int index1;
    public static int index2;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("String: ");
        String phrase = scanner.nextLine();

        System.out.print("First Index: ");
        index1 = scanner.nextInt();

        System.out.print("Second Index: ");
        index2 = scanner.nextInt();

        String proc1 = phrase;
        
        // if vowel
        if (isVowel(phrase.charAt(index1))) proc1 = processJutsu1(phrase);
        
        String proc2 = proc1;
        if (isVowel(phrase.charAt(index2))) proc2 = processJutsu2(proc1);
        // System.out.println("Proc 1: " + proc1);
        // System.out.println("Proc 2: " + proc2);

        String switched = swap(proc2, index1, index2);
        
        // output
        System.out.println();
        System.out.println("Preprocessed String: [" + proc2 + "]");
        System.out.print("Switched String: [" + switched + "]");
        
    }

    public static String processJutsu1(String phrase) {
        String newPhrase = "";
        
        int rightVal = rightValue(phrase, index1);
        int leftVal = leftValue(phrase, index1);
        
        int indexToSwitch = index1 + 1;

        if (indexToSwitch == phrase.length()) indexToSwitch = 0;
        if (indexToSwitch == 0) indexToSwitch = phrase.length() - 1;
        
        newPhrase = swap(phrase, index1, indexToSwitch);
        if (!phrase.equals(newPhrase)) index1++;
        
        return newPhrase;
    }

    public static String processJutsu2(String phrase) {
        String newPhrase = "";
        
        int rightVal = rightValue(phrase, index2);
        int leftVal = leftValue(phrase, index2);
        
        int indexToSwitch = index2 + 1;

        if (indexToSwitch == phrase.length()) indexToSwitch = 0;
        else if (indexToSwitch == 0) indexToSwitch = phrase.length() - 1;
        
        newPhrase = swap(phrase, index2, indexToSwitch);
        if (!phrase.equals(newPhrase)) index2++;
        
        return newPhrase;
    }

    public static String swap(String phrase, int i1, int i2) {
        char newCharPhrase[] = new char[phrase.length()];
        String newPhrase = "";
        if (i1 == phrase.length()) i1 = 0;
        if (i2 == phrase.length()) i2 = 0;
        newCharPhrase[i2] = phrase.charAt(i1);
        newCharPhrase[i1] = phrase.charAt(i2);
        for (int i = 0; i < phrase.length(); i++) {
            if (i == i1 || i == i2) continue;
            newCharPhrase[i] = phrase.charAt(i);
        }
        for (int i = 0; i < phrase.length(); i++) {
            newPhrase += newCharPhrase[i];
        }
        
        return newPhrase;
        
    }

    public static int rightValue(String phrase, int index) {
        if (index == phrase.length() - 1) index = 0;
        return phrase.charAt(index + 1) - 'A';
    }

    public static int leftValue(String phrase, int index) {
        if (index == 0) index = phrase.length() - 1;
        return phrase.charAt(index - 1) - 'A';
    }
    
    public static boolean isVowel(char value) {
        String vowels = "AEIOU";
        for (int i = 0; i < 5; i++) {
            if (value == vowels.charAt(i)) return true;
        }
        return false;
    }
}