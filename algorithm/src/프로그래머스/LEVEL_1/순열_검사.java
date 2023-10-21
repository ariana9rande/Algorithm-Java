package 프로그래머스;

import java.util.Arrays;

public class 순열_검사
{
    public static boolean solution(int[] arr)
    {
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++)
            if(arr[i] != i + 1)
                return false;
        return true;
    }

    public static void main(String[] args)
    {
        int[] arr = {4, 1, 3};
        System.out.println(solution(arr));
    }
}
