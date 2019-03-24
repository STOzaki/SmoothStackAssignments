package day4;

public class ProducerConsumer {
	
	public static void main(String[] args) throws InterruptedException {
		
		final ArrayObj ao = new ArrayObj();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run()
			{
				try {
					ao.produce();
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					ao.consume();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		// t1 finishes before t2
		t1.join();
		t2.join();
	}
	
	public static class ArrayObj {
		int[] intArray = new int[20];
		int consumerLoc = 0;
		int producerLoc = 0;
		boolean producerAHead = true;
		
		public void produce() throws InterruptedException {
			int value = 0;
			while(true) {
				synchronized(this) {
					
					// producer thread waits while
					// array is getting consumed
					while(!(producerAHead) && consumerLoc == producerLoc)
						wait();
					
					System.out.println("Producer produced-" + value);
					
					intArray[producerLoc] = value;
					value++;
					producerLoc++;
					
					if(producerLoc >= intArray.length) {
						producerLoc = 0;
						producerAHead = !producerAHead;
					}
					
					notify();
				}
				Thread.sleep(100);
			}
		}
		
		public void consume() throws InterruptedException {
			while (true) {
				synchronized (this) {
					
					// consumer thread waits while the array
					// has nothing left to consume
					while(producerAHead && producerLoc == consumerLoc)
						wait();
					
					int val = intArray[consumerLoc];
					consumerLoc++;
					
					System.out.println("Consumber consumed-" + val);
					
					if(consumerLoc >= intArray.length) {
						consumerLoc = 0;
						producerAHead = !producerAHead;
					}
					
					// Wake up producer thread
					notify();
					
						
				}
				// and sleep
				Thread.sleep(1000);
			}
		}
		
	}
}
