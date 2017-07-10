package org.launchcode.cheesemvc.models;

/**
 * Created by chris on 7/9/17.
 */
public class Cheese {

    private String name;
    private String description;

    public Cheese(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
