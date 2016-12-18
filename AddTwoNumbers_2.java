//import java.util.LinkedList;
//
//public class AddTwoNumbers_2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		LinkedList<Integer> list1 = new LinkedList<>();
//		LinkedList<Integer> list2 = new LinkedList<>();
//		list1.add(4);
//		list1.add(5);
//		list1.add(6);
//		list2.add(1);
//		list2.add(2);
//		list2.add(3);
//		addLists(list1,list2);
//
//	}
//
//	private static void addLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
//		// TODO Auto-generated method stub
//		LinkedList<Integer> result = new LinkedList<>();
//		int carry=0;
//		
//		
//	}
//
//}

public class AddTwoNumbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)
        return null;
        int carry = 0;
        ListNode head = new ListNode(l1.val + l2.val < 10 ? l1.val+l2.val : (l1.val+l2.val)%10 );
        carry = (l1.val + l2.val < 10 ? 0 : (l1.val+l2.val)/10 );
        l1 = l1.next!=null?l1.next:null;
        l2 = l2.next!=null?l2.next:null;
        ListNode curr = head;
        while(l1 !=null || l2 != null) {
            int sum = (((l1 != null) ? l1.val:0) + ((l2 != null) ? l2.val:0));
            ListNode result = new ListNode(sum + carry < 10 ? sum+carry : (sum+carry)%10 );
            carry = (sum + carry < 10 ? 0 : (sum+carry)/10 );
            curr.next = result;
            curr = curr.next;
            if(l1 != null)
            l1 = l1.next!=null ? l1.next:null;
            if(l2 != null)
            l2 = l2.next!=null ? l2.next:null;
        }
        if(carry != 0) {
            ListNode carry_node = new ListNode(carry);
            curr.next = carry_node;
        }
        return head;
    }
    
    public class ListNode {
    	      int val;
    	      ListNode next;
    	      ListNode(int x) { val = x; }
    	  }
}
