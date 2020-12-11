package de.bitmarck.characterpublisher.impl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.SubmissionPublisher;

import de.bitmarck.characterpublisher.CharacterPublisher;
import de.bitmarck.stringtools.StringSupplier;

public class CharacterPublisherImpl extends SubmissionPublisher<Character> implements CharacterPublisher {

	private final StringSupplier stringSupplier = StringSupplier.createInstance();
	private final ExecutorService service;
	
	public CharacterPublisherImpl() {
		service = ForkJoinPool.commonPool();
	}
	
	
	@Override
	public ExecutorService getExecuterService() {
		return service;
	}

	@Override
	public void start() {
		
		if(stringSupplier.get().isPresent()) {
			stringSupplier.get().get().chars().mapToObj(c->Character.valueOf((char) c)).forEach(this::submit);
		}
		close();

	}

}
