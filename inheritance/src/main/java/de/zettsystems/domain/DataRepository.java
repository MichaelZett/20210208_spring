package de.zettsystems.domain;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class DataRepository {
	private final Map<Long, Data> repo = new ConcurrentHashMap<>();

	public Collection<Data> allData() {
		return repo.values();
	}

	public Optional<Data> putData(String value) {
		final Data data = createData();
		data.setTheData(value);
		return Optional.ofNullable(repo.put(data.getId(), data));
	}

	/**
	 * Hier wird intern die BeanFactory.getBean() benutzt.
	 * Spring erzeugt also einen Proxy.
	 *
	 * @return wird nicht benutzt!
	 */
	@Lookup
	public Data createData() {
		return null;
	}
}
