package Medium;

public class SwapNodes_in_Pairs_24 {
    int val;
    SwapNodes_in_Pairs_24 next;
    SwapNodes_in_Pairs_24() {}
    SwapNodes_in_Pairs_24(int val) { this.val = val; }
    SwapNodes_in_Pairs_24(int val, SwapNodes_in_Pairs_24 next) { this.val = val; this.next = next; }
    public static SwapNodes_in_Pairs_24 swapParis(SwapNodes_in_Pairs_24 head) {
        SwapNodes_in_Pairs_24 curNode = head;
        byte check = 0;
        while (curNode != null && curNode.next != null) {
            SwapNodes_in_Pairs_24 temp = curNode.next;
            curNode.next = temp.next;
            temp.next = curNode;
            if (check == 0) {
                head = temp;
                ++check;
            }
            if (curNode.next != null)
                curNode = curNode.next;
            if (curNode.next != null)
                (temp.next).next = curNode.next;
        }
        return head;
    }

    public static void main(String[] args) {
        SwapNodes_in_Pairs_24 n1 =  new SwapNodes_in_Pairs_24(1);
        SwapNodes_in_Pairs_24 n2 =  new SwapNodes_in_Pairs_24(2);
        SwapNodes_in_Pairs_24 n3 =  new SwapNodes_in_Pairs_24(3);
        n1.next = n2;
        n2.next = n3;
        System.out.println(swapParis(n1));
    }
}
