package de.empfaenger;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class EndSubscriber<T> implements Subscriber<T> {

	private Subscription subscription;

	@Override
	public void onSubscribe(final Subscription subscription) {
		this.subscription = subscription;
		System.out.println("on subscribe");
		subscription.request(1);
	}

	@Override
	public void onNext(T item) {
		System.out.println(item);
		subscription.request(1);
	}

	@Override
	public void onError(Throwable throwable) {
		System.out.println(throwable.getMessage());
		
	}

	@Override
	public void onComplete() {
		System.out.println("Ende");
		
	}

}
