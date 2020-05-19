package org.launchcode.techjobs_oo;

import java.util.Objects;

public class PositionType {

    //====================================================================================================
    //  Class Fields:
    //====================================================================================================

    private int id;
    private static int nextId = 1;
    private String value;

    //====================================================================================================
    //  Class Constructors:
    //====================================================================================================

    // Default constructor for the PositionType Class
    public PositionType() {
        id = nextId;
        nextId++;
    }

    // Alternative constructor for the PositionType Class
    public PositionType(String value) {
        this();
        this.value = value;
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
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof PositionType)) return false;
        PositionType positionType = (PositionType) o;
        return getId() == positionType.getId();
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
