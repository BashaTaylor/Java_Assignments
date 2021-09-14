import java.util.Random;
import java.util.ArrayList;

public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava puzzleTest = new PuzzleJava();
        ArrayList<Integer> randomRolls = puzzleTest.getTenRolls();
        System.out.println(randomRolls);

        System.out.println(puzzleTest.getRandomLetter());
        System.out.println(puzzleTest.getRandomLetterWithArray());
        System.out.println(puzzleTest.generatePassword());
        System.out.println(puzzleTest.newPasswordEight(7));
    }
}