package de.zettsystems;

import org.springframework.beans.factory.InitializingBean;

public class SpringInitService implements InitializingBean {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	// der Hook der InitializingBean
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Message is '" + message + "' afterPropertiesSet.");

	}

}