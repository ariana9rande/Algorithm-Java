package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;

public class 최댓값_인덱스_구하기
{
    public static int[] solution(int[] arr)
    {
        int max = arr[0];
        int count = 0;

        for(int i : arr)
            if(i > max)
            {
                max = i;
            }

        for(int i = 0; i < arr.length; i++)
            if(arr[i] == max)
            {
                count++;
            }

        int[] answer = new int[count];

        int idx = 0;
        for(int i = 0; i < arr.length; i++)
            if(arr[i] == max)
                answer[idx++] = i;

        return answer;
    }

    public static void main(String[] args)
    {
        int[] arr =  {1, 3, 5, 4, 5, 2, 1};

        System.out.println(Arrays.toString(solution(arr)));
    }
}
