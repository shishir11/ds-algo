package practise.ds;

public class LinkedListImplementation {

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

	public void addNode(LinkedListImplementation list, Node node) {
		node.next = null;

		// If the Linked List is empty, then make the new node as head
		if (list.head == null) {
			list.head = node;
		} else {
			// Else traverse till the last node and insert the new_node there
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			// Insert the new_node at last node
			last.next = node;
		}
	}

	public void deleteNode(Node node) {

	}

	public void printNodeValue(LinkedListImplementation myList) {
		// printing node-value
		System.out.print("LinkedList: ");
		while (myList.head != null) {
			System.out.print(myList.head.value + " ");
			myList.head = myList.head.next;
		}
	}

	public static void main(String[] args) {
		// create an object of LinkedList
		LinkedListImplementation list = new LinkedListImplementation();
		// assign values to each linked list node
		list.addNode(list, new Node(1));
		list.addNode(list, new Node(2));
		list.addNode(list, new Node(3));

		list.printNodeValue(list);
	}
}
