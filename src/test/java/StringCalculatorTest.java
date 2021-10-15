
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class StringCalculatorTest {
    // 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
    @Test
    void add_emptyString_returnZero(){
        assertEquals(0,StringCalculator.add(""));
    }
}
