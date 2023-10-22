package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BOJ_4949_균형잡힌_세상
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String solution(String str)
    {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == '(')
                stack.addLast(1);

            if(str.charAt(i) == '[')
                stack.addLast(2);

            if(str.charAt(i) == ')')
                if(stack.isEmpty() || stack.removeLast() != 1)
                    return "no";

            if(str.charAt(i) == ']')
                if(stack.isEmpty() || stack.removeLast() != 2)
                    return "no";
        }
        if(stack.isEmpty())
            return "yes";
        else
            return "no";
    }

    public static void main(String[] args) throws IOException
    {
        String str = "";
        while(true)
        {
            str = br.readLine();
            if(str.equals("."))
                break;
            System.out.println(solution(str));
        }
    }
}
