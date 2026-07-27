import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("/// PASSWORD GENERATOR ///");
        Random random = new Random();

        String numbers = "0123456789";
        char cNumber = numbers.charAt(random.nextInt(numbers.length()));

        String letters = "abcdefghijklmnopqrstuvwxyz";
        int pos1 = random.nextInt(letters.length());
        char cLetterLow = letters.charAt(pos1);

        int pos2 = random.nextInt(letters.length());
        if (pos2 == pos1) pos2 = random.nextInt(letters.length());
        char cLetterUp = Character.toUpperCase(letters.charAt(pos2));

        String SpecialChar = "!@#$%^&*()_+-=[]{}|;:,.<>?";
        char cSpecialChar = SpecialChar.charAt(random.nextInt(SpecialChar.length()));

        List<Character> passWord = new ArrayList<>(List.of(cSpecialChar, cNumber, cLetterLow, cLetterUp));

        int i = 0;
        String allChar = numbers + SpecialChar + letters + letters.toUpperCase();
        while(i < 4){
            passWord.add(allChar.charAt(random.nextInt(allChar.length())));
            i += 1;
        }

        Collections.shuffle(passWord);
        StringBuilder sb = new StringBuilder();

        for(char c : passWord) {
            sb.append(c);
        }
        System.out.println("Password generated:");
        System.out.print(sb.toString());


    }
}
