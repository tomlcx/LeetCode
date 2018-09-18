/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode l4 = l3;
        while(l1!=null && l2!=null){
            if(l1.val <= l2.val){
                l4.next = l1;
                l1 = l1.next;
                l4 = l4.next;
            }
            else{
                l4.next = l2;
                l2 = l2.next;
                l4 = l4.next;
            }
        }
        
        if(l1 != null){
            l4.next = l1;
            l1 = l1.next;
            l4 = l4.next;
        }
        if(l2 != null){
            l4.next = l2;
            l2 = l2.next;
            l4 = l4.next;
        }
        return l3.next;
    }
}
