package 프로그래머스;

import java.util.Arrays;

public class 자연수_뒤집어_배열로_만들기
{
    public static int[] solution(long n)
    {
        int cnt = 0;
        long temp = n;

        while(temp > 0)
        {
            temp /= 10;
            cnt++;
        }

        int[] answer = new int[cnt];

        for(int i = 0; i < cnt; i++)
        {
            answer[i] = (int)(n % 10);
            n /= 10;
        }
        return answer;
    }

    public static void main(String[] args)
    {
        long n = 12345;
        System.out.println(Arrays.toString(solution(n)));
    }
}
