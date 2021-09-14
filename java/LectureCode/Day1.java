public class Day1 {
    // Entry Point Method
    public static void main(String[] args) {
      // Variables
      // Primitive Type Variables
        byte myByte = 100; // Store whole numbers from -128 to 127
        short myShort = 1000; // Stores whole numbers from -32,768 to 32,767
        int myInt = 100000; // stores whole numbers from -2,147,483,648 to 2,147,483,647
        long myLong = 10000000000L; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float myFloat = 3.14f; // stores fractional number sufficient for storing 6 to 7 decimal places
        double myDouble = 3.142342342; // Stores fractional numbers sufficient for 15 decimal digits
        boolean myBoolean = true; // Stores true or false values
        char myChar = 'c'; // Stores a single character / letter or ASCII value
      // Reference Type
        Integer myInteger = 100000;
        Character myCharacter = 'c';

      // Strings
        String myString = "Java September 2021";
        System.out.println(myString.length());
    
        String bootcamp = "Java";
        String bootCamp = "September";
        String bootCAMP = "2020";
        System.out.println(bootcamp + bootCamp + bootCAMP);

      // let name = "Matt"; let name2 = "Matt" name=name2;

        String name = "Malon";
        String name2 = "Malon";
        int num = 1;
        int num2 = 1;

      // Operators and Conditionals

        int isOdd = 5;

        if (isOdd % 2 != 0) {
        System.out.println("Number is odd");
        } else {
        System.out.println("Number is not odd");
        }

      // Loops
        int i = 0;
        while (i < 5) {
        System.out.println(i);
        i++;
        }

        for (int j = 0; j < 5; j++) {
        System.out.println(j);
        }

      // Methods
        System.out.println(sayHello("Travis"));
        sayHi("Travis");
    }

    public static void sayHi(String name) {
        System.out.println("Hi " + name);

    }

    public static String sayHello(String name) {
        return "Hello " + name;
    }
}