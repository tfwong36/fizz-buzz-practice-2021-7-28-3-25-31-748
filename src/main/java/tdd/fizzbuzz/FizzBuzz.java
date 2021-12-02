package tdd.fizzbuzz;

public class FizzBuzz {
    private static final String Whizz = "Whizz";
    private static final String Buzz = "Buzz";
    private static final String Fizz = "Fizz";

    public String countOff(int orderNumber) {
        if (orderNumber % 3 == 0 && orderNumber % 5 == 0 && orderNumber % 7 == 0)
            return Fizz + Buzz + Whizz;
        if (orderNumber % 5 == 0 && orderNumber % 7 == 0)
            return Buzz + Whizz;
        if (orderNumber % 3 == 0 && orderNumber % 7 == 0)
            return Fizz + Whizz;
        if (orderNumber % 3 == 0 && orderNumber % 5 == 0)
            return Fizz + Buzz;
        if (orderNumber % 7 == 0)
            return Whizz;
        if (orderNumber % 5 == 0)
            return Buzz;
        if (orderNumber % 3 == 0)
            return Fizz;
        return String.valueOf(orderNumber);
    }

    public static void main(String args[]){
        int range = 100;
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int index = 0; index < range; index++){
            System.out.println(fizzBuzz.countOff(index));
        }
    }
}
