import java.util.Scanner;

public class CaesarChiffreDecryption {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Text: ");
        String text = sc.nextLine();
        System.out.println(" Shift: ");
        int shift = sc.nextInt();
        String newtext = "";
        char alphabet;
        for(int i=0; i < text.length();i++)
        {
            alphabet = text.charAt(i);

            if(alphabet >= 'a' && alphabet <= 'z')
            {
                alphabet = (char) + (alphabet - shift);
                if(alphabet < 'a') {
                    alphabet = (char) + (alphabet-'a'+'z'+1);
                }
                newtext = newtext + alphabet;
            }
            else if (alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) + (alphabet - shift);
                if(alphabet < 'A') {
                    alphabet = (char) + (alphabet-'A'+'Z'+1);
                }
                newtext = newtext + alphabet;
            }
            else {
                newtext = newtext + alphabet;
            }

        }
        System.out.printf(" Decryptedtext : %s" ,newtext);
    }
}
