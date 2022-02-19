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
    public ListNode middleNode(ListNode head) {
        int c=0;
        ListNode node=head;
        while(node!=null)
        {
            node=node.next;
            c++;
        }
        int m=c/2+1;
        node=head;
        for(int i=1;i<m;i++)
        {
            node=node.next;
        }
        return node;
    }
}