public class FizzBuzz {
    boolean checkNumberContainsFive(int number) {
        while(number > 0) {
            if(number % 10 == 5) {
                return true;
            }
            number = number / 10;
        }
        return false;
    }

    boolean checkNumberContainsThree(int number) {
        while(number > 0) {
            if(number % 10 == 3) {
                return true;
            }
            number = number / 10;
        }
        return false;
    }

    String of(int number) {
        if(number < 1 || number > 100) {
            throw new IllegalArgumentException("Number is out of range");
        }
        else if(number % 3 == 0 && number % 5 == 0 || (checkNumberContainsFive(number) && checkNumberContainsThree(number)) || (number % 3 == 0 && (checkNumberContainsFive(number)))) {
            return "FizzBuzz";
        }
        else if(number % 5 == 0 || checkNumberContainsFive(number)) {
            return "Buzz";
        }
        else if(number % 3 == 0 || checkNumberContainsThree(number)) {
            return "Fizz";
        }
        else {
            return String.valueOf(number);
        }
    }
}
