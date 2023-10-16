/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
public ListNode sortList(ListNode head) {
    if (head == null || head.next == null) {
        return head;
    }
    
    // Count the number of nodes in the linked list
    int count = 0;
    ListNode curr = head;
    while (curr != null) {
        curr = curr.next;
        count++;
    }

    // Convert the linked list to an array
    int[] arr = new int[count];
    curr = head;
    for (int i = 0; i < count; i++) {
        arr[i] = curr.val;
        curr = curr.next;
    }

    // Sort the array
    Arrays.sort(arr);

    // Create a dummy node to simplify list construction
    ListNode dummy = new ListNode(0);
    curr = dummy;

    // Convert the sorted array back to a linked list
    for (int i = 0; i < count; i++) {
        curr.next = new ListNode(arr[i]);
        curr = curr.next;
    }

    return dummy.next; // Adjust the head to point to the first node in the sorted list
    }
}