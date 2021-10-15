public class StringCalculator {

    public static int add(String numbers){
        if (numbers.equals(""))
        {   return 0; }

        else if (numbers.length() ==1)
            return toInt(numbers);
        else {
            String numbersList[] = splitNumbers(numbers, ",");
            return sum(numbersList);
        }
    }
    private static int toInt(String numbers)
    {
        return Integer.parseInt(numbers);
    }

    private static String[] splitNumbers(String numbers, String  delimiter)
    {
        return numbers.split(delimiter);
    }

    private static int sum(String[] numbers)
    {
        int totalSum = 0;
        for (String number: numbers)
        {
            totalSum += toInt(number);
        }
        return totalSum;
    }
}
