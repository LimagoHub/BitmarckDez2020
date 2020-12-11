package de.bitmarck.stringtools.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

import de.bitmarck.stringtools.StringSupplier;

public class StringSupplierFileImpl implements StringSupplier {

	@Override
	public Optional<String> get() {
		try {
			final var path = Path.of("text.txt");
			
			final String content = Files.readString(path);
			
			
			return Optional.of(content);
			
			
		} catch (IOException e) {
			return Optional.empty();
		}
		
	}

}
