package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class BOJ_1764_듣보잡
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException
    {
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        // ArrayList에서 HashSet으로 바꿨더니 시간초과 통과
        HashSet<String> d = new HashSet<>();
        ArrayList<String> answer = new ArrayList<>();

        for(int i = 0; i < n; i++)
            d.add(br.readLine());

        for(int i = 0; i < m; i++)
        {
            String temp = br.readLine();

            if(d.contains(temp))
            {
                answer.add(temp);
            }
        }

        Collections.sort(answer);
        System.out.println(answer.size());
        for (String s : answer)
            System.out.println(s);
    }
}
