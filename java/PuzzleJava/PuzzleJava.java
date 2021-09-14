import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava{
    

    public ArrayList<Integer> getTenRolls(){

        ArrayList<Integer> random10 = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i=1; i<=10; i++){
            random10.add(rand.nextInt(20) + 1);
        }
        return random10;
    }
    public String getRandomLetterWithArray() {
        Random rand = new Random();

        String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabet = new String[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = String.valueOf(alphabetString.charAt(i));
        }
        
        return alphabet[rand.nextInt(26)];
    }
    public String getRandomLetter() {

        Random rand  = new Random();
        String AlphabetString = "abcdefghijklmnopqrstuvwxyz";
        char randomChar = AlphabetString.charAt(rand.nextInt(26));

        return String.valueOf(randomChar);
    }
    public String generatePassword() {

        String password = "";
        
        for (int i=0; i<8; i++) {
            password = password + getRandomLetter();
        }
        return password;
    }
    //Write a method that takes an int length as an argument and creates an array of random eight character words. The array should be the length passed in as an int.
    public ArrayList<String> newPasswordEight(int length){
        ArrayList<String> passwordset = new ArrayList<String>();
        for(int i=0; i<length; i++) {
            passwordset.add(generatePassword());
        }
        return passwordset;
    }   

} 