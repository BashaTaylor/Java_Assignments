public class FizzbuzzTest {
    public static void main(String[] args){
        Fizzbuzz tester = new Fizzbuzz();
        tester.count();
        System.out.println(tester.fizzBuzz(9)); //Fizz
        System.out.println(tester.fizzBuzz(10)); //Buzz
        System.out.println(tester.fizzBuzz(15)); //FizzBuzz
    }
}