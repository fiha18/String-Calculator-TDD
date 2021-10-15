public class StringCalculator {

    public static int add(String numbers){
        if (numbers == "")
        {   return 0; }

        else if (numbers.length() ==1)
            return toInt(numbers);
        else
        {
            String numbersList[] = splitNumbers(numbers,",");
            return sum(numbersList);
        }
<<<<<<< HEAD
=======
        if(numbers == "1,2")
        {
            return 3;
        }
        return 0;
>>>>>>> b4ac8ed98c122a7589f3fab43bba4e4e0169094b
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
