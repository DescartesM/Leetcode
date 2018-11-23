import java.util.ArrayList;
import java.util.List;

public class Question25 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode shaobing = new ListNode(0);
        shaobing.next = head;
        ListNode pre = shaobing;
        ListNode post = shaobing;
        while (isnull(post, k)){
            head=pre.next;//for next cycle
            for (int i=0;i<k;i++)
                post = post.next;
            while (pre.next != post){
                ListNode temp = pre.next;//Assign
                pre.next=temp.next;//Delete
                temp.next=post.next;
                post.next=temp;//Insert
            }
            post=head;
            pre=head;
        }
        return shaobing.next;
    }

    public static boolean isnull(ListNode temp, int k) {
        for (int i=0;i<k;i++){
            temp = temp.next;
            if (temp == null)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        ListNode l1 = new Question25.ListNode(1);
        ListNode l2 = new Question25.ListNode(2);
        ListNode l3 = new Question25.ListNode(3);
        ListNode l4 = new Question25.ListNode(4);
        ListNode l5 = new Question25.ListNode(5);
        //ListNode l6 = new Question25.ListNode(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        //.next = l6;
        ListNode ans = reverseKGroup(l1, 2);

    }
}
