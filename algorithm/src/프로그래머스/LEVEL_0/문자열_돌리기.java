package 프로그래머스.LEVEL_0;

import java.util.Scanner;

public class 문자열_돌리기
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (int i = 0; i < a.length(); i++)
        {
            System.out.println(a.charAt(i));
        }
    }
}
