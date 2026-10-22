public class Solution{
    public ListNode detectCycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Cycle detected
                
                // Step 2: Find starting point
                ListNode entry = head;

                while (entry != slow) {
                    entry = entry.next;
                    slow = slow.next;
                }

                return entry;
            }
        }

        // No cycle
        return null;
    }
}