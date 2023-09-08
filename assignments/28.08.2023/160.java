public class Solution {

    public int len(ListNode l){
        int length =0;
        while(l!=null){
            l= l.next;
            length++;
        }
        return length;
    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        int len1 = len( headA);
        int len2 = len( headB);
        if(len2>len1){
            int x = len2-len1;
            for(int i = 0 ; i<x;i++){
                b = b.next;
            }
        }
        else{
            int x = len1-len2;
            for(int i = 0 ; i<x;i++){
                a = a.next;
            }
        }
        while(a!=null && b!=null){
            if(a==b){
                return a;
            }
            a = a.next;
            b= b.next;
        }
        return null;
    }
}