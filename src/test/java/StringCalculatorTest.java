
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class StringCalculatorTest {

    @Test
    void add_emptyString_returnZero(){
        assertEquals(0,StringCalculator.add(""));
    }
}