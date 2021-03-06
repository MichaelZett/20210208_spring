package de.zettsystems.application;

import de.zettsystems.domain.DataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

public class XmlConstructorBasedService {
	private static final Logger LOG = LoggerFactory.getLogger(XmlConstructorBasedService.class);
	private final DataRepository dataRepository;

	public XmlConstructorBasedService(DataRepository dataRepository) {
		super();
		this.dataRepository = dataRepository;
	}

	public void setup() {
		dataRepository.putData("con", "Constructor");
		LOG.info(dataRepository.getDataByKey("con").get());
	}

}
