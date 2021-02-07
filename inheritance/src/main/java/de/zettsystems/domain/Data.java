package de.zettsystems.domain;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Data {
    private final long id;
    private String theData;

    public Data(DataIdGenerator dataIdGenerator) {
        this.id = dataIdGenerator.getNextId();
    }

    public Long getId() {
        return id;
    }

    public String getTheData() {
        return theData;
    }

    public void setTheData(String value) {
        this.theData = value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", theData='" + theData + '\'' +
                '}';
    }
}
