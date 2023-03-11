package Medium;

public class AddTwoNumbers_02 {
    int val;
    AddTwoNumbers_02 next;
    AddTwoNumbers_02() {}
    AddTwoNumbers_02(int val) { this.val = val; }
    AddTwoNumbers_02(int val, AddTwoNumbers_02 next) { this.val = val; this.next = next; }

    public static AddTwoNumbers_02 addTwoNumbers(AddTwoNumbers_02 l1, AddTwoNumbers_02 l2) {
        /*
        ListNode l3 = null;
        Queue<ListNode> q1 = new LinkedList<>();
        Queue<ListNode> q2 = new LinkedList<>();
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                q1.add(l1);
                l1 = l1.next;
            }
            if (l2 != null) {
                q2.add(l2);
                l2 = l2.next;
            }
        }
        int rem = 0;
        int checkLast = 0;
        int checkBefore = 0;
        int checkValueBefore = 0;
        while (q1.isEmpty() == false || q2.isEmpty() == false) {
            int t1 = 0, t2 = 0;
            if (q1.isEmpty() == false) {
                t1 = q1.peek().val;
                q1.poll();
            }
            if (q2.isEmpty() == false) {
                t2 = q2.peek().val;
                q2.poll();
            }
            int res = t1 + t2;
            if (res >= 10) {
                if ((q1.isEmpty() && q2.isEmpty()) && res >= 10)
                    ++checkLast;
                if (checkBefore == 1 && checkValueBefore < 10)
                    res = res - 10 + 0;
                else
                    res = res - 10 + rem;
                if (res == 10)
                    res = 0;
                rem = 1;
                checkBefore = 0;
            }
            else {
                if (checkBefore == 1 && checkValueBefore < 10)
                    res += 0;
                else
                    res += rem;
                if ((q1.isEmpty() && q2.isEmpty()) && res >= 10)
                    ++checkLast;
                if (res == 10) {
                    checkValueBefore = res;
                    res = 0;
                }
                else
                    checkValueBefore = res;
                checkBefore = 1;
            }
            ListNode newTail = new ListNode(res);
            if (l3 == null)
                l3 = newTail;
            else {
                ListNode tail = l3;
                while (tail.next != null)
                    tail = tail.next;
                tail.next = newTail;
            }
        }
        if (checkLast == 1) {
            ListNode newTail = new ListNode(1);
            ListNode tail = l3;
            while (tail.next != null)
                tail = tail.next;
            tail.next = newTail;
        }
        return l3;

         */
        AddTwoNumbers_02 answer = new AddTwoNumbers_02(0);
        AddTwoNumbers_02 temp = answer;

        int sum = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            temp = temp.next = new AddTwoNumbers_02(sum % 10);
            sum = sum / 10;
        }
        if (sum == 1)
            temp = temp.next = new AddTwoNumbers_02(sum);

        return answer.next;
    }

    public static void main(String[] args) {
        AddTwoNumbers_02 l1 = new AddTwoNumbers_02();
        AddTwoNumbers_02 l2 = new AddTwoNumbers_02();
        AddTwoNumbers_02 l3 = new AddTwoNumbers_02();
        AddTwoNumbers_02 l4 = new AddTwoNumbers_02();

        l1.next = l2;
        l2.next = l3;
        l1.val = 9;
        l2.val = 9;
        l3.val = 1;
        l4.val = 1;
        addTwoNumbers(l1,l4);
    }
}
