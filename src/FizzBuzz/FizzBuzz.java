package FizzBuzz;

/**
 * Created by josecopovi-king on 14/12/2016.
 */
public class FizzBuzz {
    public String evaluate(int number) {
        if (isMultipleOfFive(number) && isMultipleOfThree(number)) {
            return "FizzBuzz";
        } else if (isMultipleOfThree(number)) {
            return "Fizz";
        } else if (isMultipleOfFive(number)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }

    private boolean isMultipleOfFive(int number) {
       return number % 5 == 0;
    }
}
