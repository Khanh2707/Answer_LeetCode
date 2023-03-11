package Easy;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class RelativeRanks_506 {
    public static String[] findRelativeRanks(int[] score) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        String[] result = new String[score.length];
        int rank = score.length + 1;
        for(int i = 0; i < score.length; i++) {
            map.put(score[i],i);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            --rank;
            if (rank == 1)
                result[entry.getValue()] = "Gold Medal";
            else if (rank == 2)
                result[entry.getValue()] = "Silver Medal";
            else if ( rank == 3)
                result[entry.getValue()] = "Bronze Medal";
            else
                result[entry.getValue()] = Integer.toString(rank);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] score = {10,3,8,9,4};
        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }
}
