
public class LinkedListRemoveNthNodeFromLast {
	
	 public static class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l = new ListNode(1);
		l.next = new ListNode(2);
		l.next.next = new ListNode(3);
		int n = 1;
		ListNode result = removeNthFromEnd(l,n);
		while(result != null) {
			System.out.print(result.val + "->");
			result = result.next;
		}
		System.out.println("null");
		

	}

	private static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode curr = head;
        while(n-->0) {
            temp = temp.next;
        }
        //If need to remove the first node
        if(temp==null) {
            head = head.next;
            return head;
            
        }
        while(temp.next != null) {
            temp = temp.next;
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
	}

}
