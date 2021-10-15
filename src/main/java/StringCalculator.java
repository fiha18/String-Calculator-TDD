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
            if(numbers.startsWith("//"))
            {
                divider = Character.toString(numbers.charAt(2));
                String nums = numbers.substring(4).replaceAll("\n", divider);
                numbers = "//"+divider+"\n"+ nums;
              //  System.out.println(numbers);
            }

            if(Pattern.compile("//.\n.*").matcher(numbers).matches()){
                divider = Character.toString(numbers.charAt(2));
                numbers = numbers.substring(4);
               // System.out.println(numbers);
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
        String negatives = "";
        for (String number: numbers)
        {
            if(toInt(number) < 0)
            {
                if(negatives.equals(""))
                {
                    negatives = number;
                }
                else
                    negatives += ("," + number);
            }
            totalSum += toInt(number);
        }
        if(!negatives.equals(""))
        {
            throw new IllegalArgumentException("negatives not allowed: "+ negatives);
        }
        return totalSum;
    }
}
