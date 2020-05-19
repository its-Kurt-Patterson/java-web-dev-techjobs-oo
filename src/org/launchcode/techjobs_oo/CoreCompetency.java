package org.launchcode.techjobs_oo;

import java.util.Objects;

public class CoreCompetency {

    //====================================================================================================
    //  Class Fields:
    //====================================================================================================

    private int id;
    private static int nextId = 1;
    private String value;

    //====================================================================================================
    //  Class Constructors:
    //====================================================================================================

    // Default constructor for the CoreCompetency Class.
    public CoreCompetency() {
        this.id = nextId;
        nextId++;
    }

    // Alternate constructor for the CoreCompetency Class.
    public CoreCompetency(String value) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency that = (CoreCompetency) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
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
