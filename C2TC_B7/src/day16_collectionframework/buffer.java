package day16_collectionframework;

public class buffer {
	import java.util.Queue;
	import java.util.concurrent.ConcurrentLinkedQueue;

	//Shared class used by threads
	public class buffer1 {
		private Queue<Integer> clQueue = new ConcurrentLinkedQueue<Integer>();

		// Retrieving from the queue
		public void get() {
			System.out.println("Consumer received - " + clQueue.poll());
		}

		// putting in the queue
		public void put(int i) {
			clQueue.add(i);
			System.out.println("Producer Produced - " + i);
		}
	}


}
