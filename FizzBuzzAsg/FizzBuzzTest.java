import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void shouldPrintInputItselfWhenInputIsNotMultipleOfThreeOrFiveOrInputHasNoThreeOrFiveDigitInIt() {
        assertThat(fizzBuzz.of(79) , is("79"));
    }

    @Test
    void shouldPrintFizzWhenInputIsMultipleOfThreeOrInputContainsDigitThree() {
        assertThat(fizzBuzz.of(72) , is("Fizz"));
    }

    @Test
    void shouldPrintBuzzWhenInputIsMultipleOfFiveOrInputContainsDigitFive() {
        assertThat(fizzBuzz.of(40) , is("Buzz"));
    }

    @Test
    void shouldPrintFizzBuzzWhenInputIsMultipleOfThreeAndFiveOrInputContainsDigitFiveAndDigitThreeOrWhenInputIsDivisibleByThreeAndContainsDigitFive() {
        assertThat(fizzBuzz.of(51) , is("FizzBuzz"));
    }

}
