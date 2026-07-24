
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //判断不同情况
        if (list1 == null&&list2 == null) {
            return null;
        }else if (list1 == null && list2 != null) {
            return list2;
        }else if (list1 != null && list2 == null) {
            return list1;
        }else if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }else if (list1.val > list2.val) {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }else {
            list1.next =mergeTwoLists(list1.next, list2);
            return list1;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result = new Solution().mergeTwoLists(l1, l2);
    }
}
