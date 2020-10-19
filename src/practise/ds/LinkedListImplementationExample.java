package practise.ds;

public class LinkedListImplementationExample {

	// create an object of Node class
	// represent the head of the linked list
	Node head;

	// static inner class
	static class Node {
		int value;

		// connect each node to next node
		Node next;

		Node(int d) {
			value = d;
			next = null;
		}
	}

	public void addNode(Node node) {

	}

	public void deleteNode(Node node) {

	}

	public void getNodeValue() {
		
	}

	public static void main(String[] args) {
		// create an object of LinkedList
		LinkedListImplementationExample myList = new LinkedListImplementationExample();

		// assign values to each linked list node
		myList.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		// connect each node of linked list to next node
		myList.head.next = second;
		second.next = third;

		// printing node-value
		System.out.print("LinkedList: ");
		while (myList.head != null) {
			System.out.print(myList.head.value + " ");
			myList.head = myList.head.next;
		}
	}
}
