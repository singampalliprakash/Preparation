/*
83. Remove Duplicates from Sorted List
Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
 Return the linked list sorted as well.
Example 1:
Input: head = [1,1,2]
Output: [1,2]
Example 2:
Input: head = [1,1,2,3,3]
Output: [1,2,3]
 */

package linkedList;

public class RemoveDuplicates {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
		 
		    public ListNode deleteDuplicates(ListNode head) {
		        if(head==null)
		        {
		            return null;
		        }
		        ListNode curr=head;
		        while(curr!=null && curr.next!=null)
		        {
		            if(curr.val==curr.next.val)
		            {
		                curr.next=curr.next.next;
		            }
		            else
		            {
		                curr=curr.next;
		            }
		        }
		        return head;
		        
		        //By using HashSet
		        // HashSet<Integer> set=new HashSet<>();
		        // ListNode temp=head;
		        // while(temp!=null)
		        // {
		        //     set.add(temp.val);
		        //     temp=temp.next;
		        // }
		        // ListNode dup=new ListNode(-1);
		        // ListNode curr=dup;
		        // for(int valu:set)
		        // {
		        //     curr.next=new ListNode(valu);
		        //     curr=curr.next;
		        // }
		        // return dup.next;

		        
		    }
		}

