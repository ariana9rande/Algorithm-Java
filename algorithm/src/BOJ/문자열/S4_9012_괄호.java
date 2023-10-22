package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9012_괄호
{
    // 괄호 짝이 맞는 문자열이면 "YES" return
    // 짝이 안 맞으면 "NO" return
    // )로 시작하거나 (로 끝나면 안됨

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String solution(String str)
    {
        int cnt = 0;

        // (가 없는데 )가 나오면 no
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == '(')
                cnt++;

            if (str.charAt(i) == ')')
                cnt--;

            if (cnt < 0)
                return "NO";
        }

        if (cnt == 0)
            return "YES";
        else
            return "NO";
    }

    public static void main(String[] args) throws IOException
    {
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++)
        {
            String str = br.readLine();
            System.out.println(solution(str));
        }
    }
}
