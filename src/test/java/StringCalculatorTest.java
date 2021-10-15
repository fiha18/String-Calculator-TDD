
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class StringCalculatorTest {
    // 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
    @Test
    void testEmptyString(){
        assertEquals(0,StringCalculator.add(""));
    }

    @Test
    void testOneNumberHardCoded()
    {
        assertEquals(1,StringCalculator.add("1"));
    }
    @Test
    void testOneNumber()
    {
        assertEquals(4,StringCalculator.add("4"));
    }

    @Test
    void testTwoNumber_OneAndTwo()
    {
        assertEquals(3,StringCalculator.add("1,2"));
    }
    @Test
    void testTwoNumber()
    {
        assertEquals(7,StringCalculator.add("3,4"));
    }
    @Test
    void testThreeNumberSum()
    {
        assertEquals(6,StringCalculator.add("1,2,3"));
    }
    @Test
    void testUnknownNumberSum()
    {
        assertEquals(55,StringCalculator.add("1,2,3,4,5,6,7,8,9,10"));
    }
    @Test
    void testNewlineCharacterInsteadComma()
    {
        assertEquals(6,StringCalculator.add("1\n2,3"));
    }
    @Test
    void testDifferentDelimiter()
    {
        assertEquals(6, StringCalculator.add("//;\n1;2;3"));
    }
    @Test
    void testDifferentDelimiterwithNewLine()
    {
        assertEquals(6,StringCalculator.add("//-\n1-2\n3"));
    }
}


