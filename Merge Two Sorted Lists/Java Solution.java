class Solution {
    
    // TC: O(n+m), where n and m are the lengths of the two input lists.
    // SC: O(1)

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        ListNode pointer1 = list1;
        ListNode pointer2 = list2;

        while (pointer1 != null && pointer2 != null) {
            if (pointer1.val <= pointer2.val) {
                current.next = pointer1;
                pointer1 = pointer1.next;
            } else {
                current.next = pointer2;
                pointer2 = pointer2.next;
            }

            current = current.next;
        }

        if (pointer1 != null) {
            current.next = pointer1;
        } else {
            current.next = pointer2;
        }

        return dummy.next;
    }
}
