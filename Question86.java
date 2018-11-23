public class Question86 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode partition(ListNode head, int x) {
        ListNode shabing = new ListNode(0);
        ListNode shabing2 = new ListNode(0);
        ListNode less_head = shabing;   //设置两个临时的头节点
        ListNode more_head = shabing2;
        while(head!=null){
            if(head.val < x){  //如果节点值小于x，则将节点插入less_ptr后
                less_head.next = head;
                less_head = head;
            }
            else{  //否则将节点插入more_ptr后
                more_head.next = head;
                more_head = head;
            }
            head = head.next;  //遍历链表
        }
        less_head.next = shabing2.next;
        more_head.next = null;  //将more_ptr即链表尾节点next置空
        return shabing.next;  //less_head的next节点即为新链表头节点，返回
    }
    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(2);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        ListNode ans = partition(l1, 3);

    }
}
