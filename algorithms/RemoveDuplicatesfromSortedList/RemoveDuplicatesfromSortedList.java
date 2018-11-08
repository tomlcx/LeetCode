/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currt = head;
        while(currt!=null && currt.next!=null){
            if(currt.val == currt.next.val)
                currt.next = currt.next.next;
            else
                currt = currt.next;
        }
        return head;
    }
}
