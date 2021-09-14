import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class Day2 {
    public static void main(String[] args) {
    String name = "Travis";
    String foo = "Travis";

    String name3 = new String("Chris");
    String name4 = new String("Chris");
    System.out.println(name == foo);

    // Arrays
    String[] people = { "Matt", "Chris", "Zach", "Kevin" };
    people[0] = "Chris";
    people[1] = "Matthew";

    String temp = people[0];
    people[0] = people[1];
    people[1] = temp;

    int[] numbers = new int[10];
    for (int i = 0; i < numbers.length; i++) {
        numbers[i] = i + 1;
    }

    System.out.println(Arrays.toString(numbers));
    for (int num : numbers) {
        System.out.println(num);
    }

    // Array List
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("hello");
    stringList.add("my");
    stringList.add("name");
    stringList.add("is");
    stringList.add("my");

    System.out.println(stringList.contains("my"));

    // HashMap
    HashMap<String, String> ourHobbies = new HashMap<String, String>();
    ourHobbies.put("Matthew", "Photography");
    ourHobbies.put("Zach", "Roleplayers");
    ourHobbies.put("Nate", "Dogs");
    ourHobbies.put("Chris", "Gaming");
    ourHobbies.put("Travis", "Painting");
    ourHobbies.put("Kevin", "Crochet");
    ourHobbies.put("Maria", "Astronomy");
    ourHobbies.put("Basha", "Piano Playing");
    ourHobbies.put("David", "Dungeons and Dragons");
    ourHobbies.put("Tony", "MMA");
    ourHobbies.put("Lauren", "Learning Languages");
    ourHobbies.put("Anna", "Zumba");
    ourHobbies.put("Bill", "Busting people");
    System.out.println(ourHobbies.get("Anna"));
    for (String value : ourHobbies.keySet()) {
        System.out.println(value);
    }
    System.out.println(largestValueInArray(numbers));
    System.out.println("Hi Kevin!");
    }

    public static int largestValueInArray(int[] arr) {
    int maxValue = arr[0];
    for (int i = 0; i <= arr.length; i++) {
        try {
        if (arr[i] > maxValue) {
            maxValue = arr[i];
        }
        } catch (Exception e) {
        System.out.println(e);
        }
    }
    return maxValue;
    }
}