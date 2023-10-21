import java.util.Scanner;

public class day231021
{
    public static void main(String[] args)
    {
        /*
        5일이 정수 10개를 입력받아 양의 정수와 음의 정수의 평균의 차 구하기
        19일이 3명의 학생이 4과목 시험을 봤을 때 전체 성적에 대해 합, 평균, 분산 각각 구하기 (학생별, 과목별)
        26일이 19일이랑 똑같이 학생 3명 과목 4갠데 최대, 최소, 평균, 분산 함수 이용해서 구하기!
         */
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int p_sum = 0, n_sum = 0, p_cnt = 0, n_cnt = 0;

        System.out.print("정수 10개 입력: ");

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();

            if (arr[i] > 0)
            {
                p_sum += arr[i];
                p_cnt++;
            }
            else if (arr[i] < 0)
            {
                n_sum += arr[i];
                n_cnt++;
            }
        }

        double p_avg = (double)p_sum / p_cnt;
        double n_avg = (double)n_sum / n_cnt;

        System.out.println("p_sum = " + p_sum);
        System.out.println("p_cnt = " + p_cnt);
        System.out.println("n_sum = " + n_sum);
        System.out.println("n_cnt = " + n_cnt);

        System.out.println("p_avg - n_avg = " + (p_avg - n_avg));
    }
}
