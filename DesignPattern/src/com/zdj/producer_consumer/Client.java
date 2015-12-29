package com.zdj.producer_consumer;

public class Client {
	public static void main(String[] args) {
		PublicResource resource = new PublicResource();
		new Thread(new ProducerThread(resource)).start();
		new Thread(new ConsumerThread(resource)).start();
//		new Thread(new ProducerThread(resource)).start();
//		new Thread(new ConsumerThread(resource)).start();
//		new Thread(new ProducerThread(resource)).start();
//		new Thread(new ConsumerThread(resource)).start();
	}
}
