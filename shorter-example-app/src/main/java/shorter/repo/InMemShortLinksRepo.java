package shorter.repo;

import ioc.annotation.Component;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component(name = "repo")
public class InMemShortLinksRepo implements ShortLinksRepo {

	private Map<String, String> links = new HashMap<>();

	@Override
	public Optional<String> get(String shortPath) {
		return Optional.ofNullable(links.get(shortPath));
	}

	@Override
	public void put(String shortPath, String fullPath) {
		links.put(shortPath, fullPath);
	}

}
