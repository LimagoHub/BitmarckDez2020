import de.bitmarck.characterpublisher.CharacterPublisher;
import de.bitmarck.characterpublisher.impl.CharacterPublisherImpl;

module characterPublisherModule {
	exports de.bitmarck.characterpublisher;
	requires stringSupplierModule;
	uses CharacterPublisher;
	provides CharacterPublisher with CharacterPublisherImpl;
}