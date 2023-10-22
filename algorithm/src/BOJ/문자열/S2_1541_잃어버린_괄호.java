package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BOJ_1541_잃어버린_괄호
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException
    {
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        sb.append(str);


        int flag = 0;

//        while(i < sb.length())
//        {
//            if(sb.charAt(i) == '-' && flag == 0)
//            {
//                flag = 1;
//                sb.insert(i + 1, '(');
//                i++;
//            }
//
//            if(sb.charAt(i) == '-' && flag == 1)
//            {
//                flag = 0;
//                sb.insert(i, ')');
//                i++;
//            }
//
//            i++;
//
////            System.out.println("sb = " + sb.toString());
////            System.out.println("sb.length() = " + sb.length());
////            System.out.println("i = " + i);
//        }

        ArrayList<Integer> list = new ArrayList<>();
        String[] temp = str.split("-");
        for(int i = 0; i < temp.length; i++)
        {
            int sum = 0;
            for(String item : temp[i].split("\\+"))
                sum += Integer.parseInt(item);

            list.add(sum);
        }

        int answer = 0;
        for(int item : list)
            answer += item;
        answer -= list.get(0) * 2;
        answer -= answer * 2;
        System.out.println(answer);
    }
}
