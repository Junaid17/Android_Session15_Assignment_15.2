package com.example.jmush.android_session15_assignment_152;

/**
 * Created by jmush on 10/14/17.
 */

public class DataModel {

    String name;
    String version;

    public DataModel(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
