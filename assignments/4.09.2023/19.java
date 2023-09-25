class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head;
        ListNode slow = head;

        // moving Fast first
        for(int i =0;i<n;i++){
            fast = fast.next;
        }

        // if fast reaches at the end (null) that means que. is "removing first node(head)"
        if(fast == null) return head.next;

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next; // removing nth node
        return head; // returning Final linked list
    }
}
