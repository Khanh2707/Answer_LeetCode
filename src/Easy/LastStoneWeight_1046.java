package Easy;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LastStoneWeight_1046 {
    public static int lastStoneWeight(int[] stones) {
        Queue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < stones.length; i++) {
            heap.add(stones[i]);
        }

        if (heap.size() <= 1)
            return heap.peek();
        else {
            while (heap.size() > 1) {
                int result = heap.poll() - heap.poll();
                heap.add(result);
            }
            return heap.peek();
        }
    }

    public static void main(String[] args) {
        int stones[] = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));
    }
}
