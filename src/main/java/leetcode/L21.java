package leetcode;

/**
 * @ProjectName: JavaPractice
 * @Package: leetcode
 * @ClassName: L21
 * @Author: Frank.Cao
 * @Description:
 * @Date: 2021/7/6 16:51
 * @Version: 1.0
 */
public class L21 {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode result = l1.val <= l2.val? l1:l2;
        result.next = mergeTwoLists(result.next, l1.val > l2.val? l1:l2);

        return result;
    }

    public static void main(String[] args) {
        ListNode l13 = new ListNode(4);
        ListNode l12 = new ListNode(2, l13);
        ListNode l11 = new ListNode(1, l12);

        ListNode l23 = new ListNode(4);
        ListNode l22 = new ListNode(3, l23);
        ListNode l21 = new ListNode(1, l22);

        System.out.println(mergeTwoLists(l11, l21).val);
    }
}