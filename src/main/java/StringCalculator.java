import java.util.regex.Pattern;

public class StringCalculator {

    public static int add(String numbers){

        if (numbers.equals(""))
        {   return 0; }

        else if (numbers.length() ==1)
            return toInt(numbers);
        else {

            //numbers = numbers.replaceAll("\n",",");
            String divider = ",";
            //numbers.matches("//(.)\n(.*)"
            if(Pattern.compile("//.\n.*").matcher(numbers).matches()){
                divider = Character.toString(numbers.charAt(2));
                numbers = numbers.substring(4);
            }

            //numbers = numbers.replaceAll("\n",divider);
            String numbersList[] = splitNumbers(numbers,divider);
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
