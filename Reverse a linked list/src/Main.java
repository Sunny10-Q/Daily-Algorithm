class Solution {
    public ListNode reverseList(ListNode head) {
        //判断当前节点是不是最后一个节点
        if (head == null || head.next == null) return head;

        //记录当前节点的下一个节点
        ListNode cur = head.next;

        ListNode newcur = reverseList(cur);
        cur.next = head;
        head.next = null;
        return newcur;
    }
}


public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Solution solution = new Solution();
        System.out.println(solution.reverseList(head));
    }
}
