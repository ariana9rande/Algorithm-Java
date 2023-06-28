package 프로그래머스.LEVEL_0;

public class 문자열_겹쳐쓰기
{
    public static void main(String[] args)
    {
        System.out.println(solution("He11oWor1d", "lloworl", 2));
        System.out.println(solution("Program29b8UYP", "merS123", 7));
    }

    public static String solution(String my_string, String overwrite_string, int s)
    {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++)
        {
            if (i < s)
                answer += my_string.charAt(i);
            else
            {
                if (i - s < overwrite_string.length())
                {
                    answer += overwrite_string.charAt(i - s);
                }
                else
                {
                    answer += my_string.charAt(i);
                }
            }
        }

        return answer;
    }
}
