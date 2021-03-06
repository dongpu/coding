/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 * 
 * O(n).
 */ 
public class Solution {
    /**
     * @param head: The first node of linked list.
     * @return: The node where the cycle begins. 
     *           if there is no cycle, return null
     */
    public ListNode detectCycle(ListNode head) {  
        // write your code here
        ListNode slow = head; 
        ListNode fast = head; 
        
        while (fast != null) {
            fast = fast.next; 
            
            if (fast != null) {
                slow = slow.next; 
                fast = fast.next; 
            }
            
            if (slow == fast) {
                break; 
            }
        }
        
        if (fast == null) {
            return null; 
        }
        
        slow = head; 
        
        while (slow != fast) {
            slow = slow.next; 
            fast = fast.next; 
        }
        
        return slow; 
    }
}

