public class Fizzbuzz {
    public void count() {
        for (int i = 1; i <= 100; i++) {
        String result = fizzBuzz(i);
        System.out.printf("Number: %d Result %s \n", i, result);
        }
    }

    public String fizzBuzz(int val) {
        if (val % 3 == 0 && val % 5 == 0) {
        return "FizzBuzz";
        } else if (val % 3 == 0) {
        return "Fizz";
        } else if (val % 5 == 0) {
        return "Buzz";
        } else {
        return Integer.toString(val);
        }
    }
}