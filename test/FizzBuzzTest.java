import FizzBuzz.FizzBuzz;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by josecopovi-king on 14/12/2016.
 */
public class FizzBuzzTest {

    private FizzBuzz fb;

    @Before
    public void setUp() throws Exception {
        fb = new FizzBuzz();
    }

    @Test
    public void oneReturnsOne() {
        assertEquals("1", fb.evaluate(1));
    }

    @Test
    public void twoReturnsTwo() {
        assertEquals("2", fb.evaluate(2));
    }

    @Test
    public void threeReturnsThree() {
        assertEquals("Fizz", fb.evaluate(3));
    }

    @Test
    public void fiveReturnsBuzz() {
        assertEquals("Buzz", fb.evaluate(5));
    }

    @Test
    public void sixReturnsFizz() {
        assertEquals("Fizz", fb.evaluate(6));
    }

    @Test
    public void tenReturnsBuzz() {
        assertEquals("Buzz", fb.evaluate(10));
    }

    @Test
    public void fifteenReturnsFizzBuzz() {
        assertEquals("FizzBuzz", fb.evaluate(15));
    }

    @Test
    public void thirtyReturnsFizzBuzz() {
        assertEquals("FizzBuzz", fb.evaluate(30));
    }

}
