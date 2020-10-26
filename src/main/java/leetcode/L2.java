package leetcode;

import java.util.List;

/*
        给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

        如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

        您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

        示例：

        输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
        输出：7 -> 0 -> 8
        原因：342 + 465 = 807
        通过次数594,593提交次数1,535,855

*/
public class L2 {

    private ListNode result = new ListNode(-1);
    private int tmp = 0;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int sum  = 0;
        sum = (l1.val + l2.val + tmp)%10;
        tmp = (l1.val + l2.val + tmp)/10;

        System.out.println(sum + " , " + tmp);
        return new ListNode();
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
        ListNode l11 = new ListNode(4);
        ListNode l12 = new ListNode(3);
        l1.next = l11;
        l11.next = l12;

        ListNode l2 = new ListNode(5);
        ListNode l21 = new ListNode(6);
        ListNode l22 = new ListNode(4);
        l2.next = l21;
        l21.next = l22;

        L2 o = new L2();
        o.addTwoNumbers(l1,l2);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
