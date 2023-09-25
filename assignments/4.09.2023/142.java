public class Solution {
    public ListNode detectCycle(ListNode head) {
        // Edge Case 
        if(head == null || head.next ==null){
            return null;
        }

        // two Pointer method
        ListNode fast = head;
        ListNode slow = head;
        ListNode entry = head;

        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow ){
                while(entry != slow){
                    slow = slow.next;
                    entry = entry.next;
                }
                return entry;
            }
        }
        return null;
    }
}