package 프로그래머스.LEVEL_0;

import java.util.Scanner;

public class 문자열_붙여서_출력하기
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
//        String output = "";
//        char temp;
//
//        for(int i = 0; i < a.length(); i++)
//        {
//            temp = a.charAt(i);
//            if(temp != ' ')
//            {
//                output += temp;
//            }
//        }
//
//        for(int i = 0; i < b.length(); i++)
//        {
//            temp = b.charAt(i);
//            if(temp != ' ')
//            {
//                output += temp;
//            }
//        }
//
//        System.out.println(output);
        System.out.println(a + b);
    }
}
