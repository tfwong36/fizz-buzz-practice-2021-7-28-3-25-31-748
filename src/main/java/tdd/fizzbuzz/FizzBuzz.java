package tdd.fizzbuzz;

public class FizzBuzz {
    private static final String Whizz = "Whizz";
    private static final String Buzz = "Buzz";
    private static final String Fizz = "Fizz";

    public String countOff(int orderNumber) {
        String outputString = "";
        if (orderNumber % 3 == 0)
            outputString += Fizz;
        if (orderNumber % 5 == 0)
            outputString += Buzz;
        if (orderNumber % 7 == 0)
            outputString += Whizz;
        if (outputString.length() == 0)
            return String.valueOf(orderNumber);
        return outputString;
    }

    public static void main(String args[]){
        int range = 100;
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int index = 0; index < range; index++){
            System.out.println(fizzBuzz.countOff(index));
        }
    }
}
