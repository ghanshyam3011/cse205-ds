ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode curr = head,prev= dummy;
        
        while(curr!=null)
        {
            if(curr.next!=null && curr.next.val<curr.val)
            {
             while(prev!=null && prev.next.val<curr.next.val)
             prev = prev.next;
                
             ListNode temp = prev.next;
                prev.next = curr.next;
                curr.next = curr.next.next;
                prev.next.next = temp;
                prev = dummy;
            }
            else{
                curr = curr.next;
            }
        }
        return dummy.next;