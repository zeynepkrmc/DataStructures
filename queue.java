import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();

		// add elements to the queue
		queue.add("apple");
		queue.add("banana");
		queue.add("cherry");

		// print the queue
		System.out.println("Queue: " + queue);

		// remove the element at the front of the queue
		String front = queue.remove();
		System.out.println("Removed element: " + front);

		// print the updated queue
		System.out.println("Queue after removal: " + queue);

		// add another element to the queue
		queue.add("date");

		// peek at the element at the front of the queue
		String peeked = queue.peek();
		System.out.println("Peeked element: " + peeked);

		// print the updated queue
		System.out.println("Queue after peek: " + queue);
	}
}

// Java program to demonstrate a Queue

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args)
	{
		Queue<Integer> q
			= new LinkedList<>();

		// Adds elements {0, 1, 2, 3, 4} to
		// the queue
		for (int i = 0; i < 5; i++)
			q.add(i);

		// Display contents of the queue.
		System.out.println("Elements of queue "
						+ q);

		// To remove the head of queue.
		int removedele = q.remove();
		System.out.println("removed element-"
						+ removedele);

		System.out.println(q);

		// To view the head of queue
		int head = q.peek();
		System.out.println("head of queue-"
						+ head);

		// Rest all methods of collection
		// interface like size and contains
		// can be used with this
		// implementation.
		int size = q.size();
		System.out.println("Size of queue-"
						+ size);
	}
}

// Java program to add elements
// to a Queue

import java.util.*;

public class GFG {

	public static void main(String args[])
	{
		Queue<String> pq = new PriorityQueue<>();

		pq.add("Geeks");
		pq.add("For");
		pq.add("Geeks");

		System.out.println(pq);
	}
}

// Java program to remove elements
// from a Queue

import java.util.*;

public class GFG {

	public static void main(String args[])
	{
		Queue<String> pq = new PriorityQueue<>();

		pq.add("Geeks");
		pq.add("For");
		pq.add("Geeks");

		System.out.println("Initial Queue " + pq);

		pq.remove("Geeks");

		System.out.println("After Remove " + pq);

		System.out.println("Poll Method " + pq.poll());

		System.out.println("Final Queue " + pq);
	}
}

// Java program to iterate elements
// to a Queue

import java.util.*;

public class GFG {

	public static void main(String args[])
	{
		Queue<String> pq = new PriorityQueue<>();

		pq.add("Geeks");
		pq.add("For");
		pq.add("Geeks");

		Iterator iterator = pq.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
