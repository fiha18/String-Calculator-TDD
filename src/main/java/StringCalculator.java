public class StringCalculator {

    public static int add(String numbers){
        if (numbers == "")
        {   return 0; }
        if(numbers == "1")
        {
            return 1;
        }
        if(numbers.length() == 1)
        {
            return toInt(numbers);
        }
        return 0;
    }
    private static int toInt(String numbers)
    {
        return Integer.parseInt(numbers);
    }
}
