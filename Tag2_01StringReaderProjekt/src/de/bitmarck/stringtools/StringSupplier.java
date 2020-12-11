package de.bitmarck.stringtools;

import java.util.Optional;
import java.util.ServiceLoader;
import java.util.function.Supplier;

public interface StringSupplier extends Supplier<Optional<String>> {
	
	static StringSupplier createInstance() {
		return ServiceLoader.load(StringSupplier.class).findFirst().get();
	}

}
