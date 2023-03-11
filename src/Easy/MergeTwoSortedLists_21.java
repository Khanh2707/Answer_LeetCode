package Easy;

public class MergeTwoSortedLists_21 {
    int val;
    MergeTwoSortedLists_21 next;

    MergeTwoSortedLists_21() {
    }

    MergeTwoSortedLists_21(int val) {
        this.val = val;
    }

    MergeTwoSortedLists_21(int val, MergeTwoSortedLists_21 next) {
        this.val = val;
        this.next = next;
    }

    public static MergeTwoSortedLists_21 mergeTwoLists(MergeTwoSortedLists_21 list1, MergeTwoSortedLists_21 list2) {
        MergeTwoSortedLists_21 list0 = new MergeTwoSortedLists_21(-1);
        MergeTwoSortedLists_21 res = list0;

        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    list0.next = new MergeTwoSortedLists_21(list1.val);
                    list0 = list0.next;
                    list1 = list1.next;
                }
                else {
                    list0.next = new MergeTwoSortedLists_21(list2.val);
                    list0 = list0.next;
                    list2 = list2.next;
                }
            }
            else {
                if (list1 != null) {
                    list0.next = new MergeTwoSortedLists_21(list1.val);
                    list0 = list0.next;
                    list1 = list1.next;
                }
                else {
                    list0.next = new MergeTwoSortedLists_21(list2.val);
                    list0 = list0.next;
                    list2 = list2.next;
                }
            }
        }
        return res.next;
    }

    public static void main(String[] args) {
        MergeTwoSortedLists_21 n1 = new MergeTwoSortedLists_21(-9);
        MergeTwoSortedLists_21 n2 = new MergeTwoSortedLists_21(3);
        MergeTwoSortedLists_21 n3 = new MergeTwoSortedLists_21(5);
        MergeTwoSortedLists_21 n4 = new MergeTwoSortedLists_21(7);
        n1.next = n2;
        n3.next = n4;
        mergeTwoLists(n1,n3);
    }
}
