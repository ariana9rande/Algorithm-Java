package 프로그래머스.LEVEL_0;

import java.util.Scanner;

public class 대소문자_바꿔서_출력하기
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char temp;
        String output = "";

        for (int i = 0; i < a.length(); i++)
        {
            temp = a.charAt(i);

            if (65 <= temp && temp <= 90)
                output += (char) (temp + 32);
            else if (temp >= 97 && temp <= 122)
                output += (char) (temp - 32);
        }

        System.out.println(output);
    }
}
