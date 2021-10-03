package main.java.leetcode;

public class AddTwoNumbers {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public static void main(String[] args) {
		addTwoNumbers(new ListNode(5), new ListNode(7));
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode node = new ListNode();
		int val = l1.val + l2.val;
		
		node.val = val % 10;
		l1 = l1.next;
		l2 = l2.next;
		while(l1 != null && l2 != null) {
			node.next = new ListNode((val = val / 10 + l1.val + l2.val) % 10);
			node = node.next;
			l1 = l1.next;
			l2 = l2.next;
		}
		while(l1 != null) {
			node.next = new ListNode((val = val / 10 + l1.val) % 10);
			node = node.next;
			l1 = l1.next;
		}
		while(l2 != null) {
			node.next = new ListNode((val = val / 10 + l2.val) % 10);
			node = node.next;
			l2 = l2.next;
		}
		return node;
    }

}
