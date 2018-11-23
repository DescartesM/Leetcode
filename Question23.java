import java.util.ArrayList;
import java.util.List;
/*
递归经典例子+链表操作
 */
public class Question23 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        return digui(lists, 0, lists.length);
    }

    public static ListNode digui(ListNode[] lists, int start, int end) {
        if (start == end)
            return lists[start]; // 返回条件
        else{
            int mid = (start + end) / 2;
            ListNode l1 = digui(lists, start, mid);
            ListNode l2 = digui(lists, mid+1, end);
            return merge2Lists(l1, l2);
        }
    }

    private static ListNode merge2Lists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val<l2.val){
            l1.next=merge2Lists(l1.next,l2);
            return l1;
        }else{
            l2.next=merge2Lists(l1,l2.next);
            return l2;
        }
    }

    public static void main(String[] args){
        List<List<Integer>> res = new ArrayList<>();

    }
}

