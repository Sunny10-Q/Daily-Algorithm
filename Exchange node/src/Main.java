
class Solution {
    public ListNode swapPairs(ListNode head) {
        //判断当前节点是不是最后一个节点
        if (head == null || head.next == null) return head;

        //或者后面交换完成的新节点
        ListNode newcur=swapPairs(head.next.next);
        //将本节点的下一个节点交换位置
        ListNode cur=head.next;
        cur.next=head;
        head.next=newcur;
        return cur;
    }
}
public class Main {
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        Solution solution = new Solution();
        System.out.println(solution.swapPairs(head));
    }
}
