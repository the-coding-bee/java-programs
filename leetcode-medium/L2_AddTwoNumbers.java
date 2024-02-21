
public class L2_AddTwoNumbers {

	public static void main(String[] args) {

		// 2--> 4-->3 (342)
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		// 5-->6-->4 (564)
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		Solution_L2 s = new Solution_L2();
		ListNode l3 = s.addTwoNumbers(l1, l2);

		// display singly linked list
		while (l3 != null) {
			System.out.print(l3.val + "-->");
			l3 = l3.next;
		}
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

class Solution_L2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode result = new ListNode(0);
		ListNode l3 = result;

		int carry = 0;

		while (l1 != null || l2 != null) {

			int sum = 0 + carry;

			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}

			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}

			carry = sum / 10;
			sum = sum % 10;

			l3.next = new ListNode(sum);
			l3 = l3.next;
		}

		if (carry == 1) {
			l3.next = new ListNode(1);
		}

		return result.next;

	}
}
