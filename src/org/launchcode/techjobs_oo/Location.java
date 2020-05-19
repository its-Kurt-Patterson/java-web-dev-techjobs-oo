package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Location {

    //====================================================================================================
    //  Class Fields:
    //====================================================================================================

    private int id;
    private static int nextId = 1;
    private String value;

    //====================================================================================================
    //  Class Constructors:
    //====================================================================================================

    // Default constructor for Location Class.
    public Location() {
        id = nextId;
        nextId++;
    }

    // Alternate constructor for the Location Class.
    public Location(String aValue) {
        this();
        this.value = aValue;
    }

    //====================================================================================================
    //  Class Methods:
    //====================================================================================================

    // Insert any Class Methods here...

    //====================================================================================================
    //  Custom Override Methods:
    //====================================================================================================

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return getId() == location.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    //====================================================================================================
    //  Class Getters and Setters:
    //====================================================================================================

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
