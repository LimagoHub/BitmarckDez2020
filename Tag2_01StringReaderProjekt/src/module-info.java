import de.bitmarck.stringtools.StringSupplier;
import de.bitmarck.stringtools.impl.StringSupplierFileImpl;

module stringSupplierModule {
	
	exports de.bitmarck.stringtools;
	uses StringSupplier;
	provides StringSupplier with StringSupplierFileImpl;
}