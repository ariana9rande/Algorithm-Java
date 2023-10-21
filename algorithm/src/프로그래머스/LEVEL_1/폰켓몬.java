package 프로그래머스;

import java.util.HashSet;

public class 폰켓몬
{
    public int solution(int[] nums)
    {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int n : nums)
            hashSet.add(n);

        if (hashSet.size() >= nums.length / 2)
            return nums.length / 2;
        else
            return hashSet.size();
    }
}
