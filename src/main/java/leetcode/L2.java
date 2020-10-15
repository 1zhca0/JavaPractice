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

        if (l1.val!=0||l2.val!=0||tmp==1){
            int v1 = l1 == null ? 0:l1.val;
            int v2 = l2 == null ? 0:l2.val;
            int resultVal = 0;
            if(ifUpTen(v1, v2, tmp)){
                resultVal = (v1+v2+tmp) - 10;
                tmp = 1;
            } else {
                resultVal = v1 + v2 + tmp;
                tmp = 0;
            }

            if(result.val==-1){
                result.val = resultVal;
            } else {
                result.next = new ListNode(resultVal);
                result = result.next;
            }
            System.out.println(resultVal);

            if (l1.next==null)
                l1.next = new ListNode(0);
            if (l2.next == null)
                l2.next = new ListNode(0);

            this.addTwoNumbers(l1.next, l2.next);
        }
        return result;
    }

    public static boolean ifUpTen(int i1, int i2, int tmp){
        if((i1+i2+tmp)>=10)
            return true;
        return false;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
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
