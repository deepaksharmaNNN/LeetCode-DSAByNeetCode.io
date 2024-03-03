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
    public ListNode findmid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head) {
      ListNode temp = head;
      ListNode curr = null;
      ListNode prev;   
      while(temp != null){
        prev = curr;
        curr = temp;
        temp = temp.next;
        curr.next = prev;
      }
      return curr;
    }
    public int pairSum(ListNode head) {
        ListNode mid = findmid(head);
        ListNode midhead = reverse(mid);

        ListNode temp1 = head;
        ListNode temp2 = midhead;
        
        int ans=(int)(-1e9);
        while(temp1 != null && temp2 != null){
            ans=Math.max(ans, temp1.val+temp2.val);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return ans;
    }
}