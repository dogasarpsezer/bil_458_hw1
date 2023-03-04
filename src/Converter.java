import java.lang.Math;

public class Converter
{
    public String ConvertBinaryToOctal(String binary)
    {
        String result = new String("");

        int value = 0;
        for (int i = binary.length() - 1, j = 0; i >= 0; i--,j++)
        {
            if(binary.charAt(i) == '1')
            {
                value += Math.pow(2,j);
            }

            if(j == 2 || i == 0)
            {
                j = -1;
                result = value + result;
                value = 0;
            }
        }
        return result;
    }

    public Boolean CheckIfBinary(String input)
    {
        for (int i = 0; i < input.length(); i++)
        {
            char var = input.charAt(i);
            if(var != '1' && var != '0')
            {
                return false;
            }
        }
        return true;
    }
}
