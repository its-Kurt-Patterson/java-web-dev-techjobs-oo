package org.launchcode.techjobs_oo;

import java.lang.reflect.Array;
import java.util.Objects;

public class Job {

    //====================================================================================================
    //  Class Fields:
    //====================================================================================================

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    //====================================================================================================
    //  Class Constructors:
    //====================================================================================================

    // Default constructor for the Job Class.
    public Job() {
        id = nextId;
        nextId++;
    }

    // Alternate constructor for the Job Class.
    public Job(String aName, Employer aEmployer,
               Location aLocation, PositionType aPositionType,
               CoreCompetency aCoreCompetency){
        this();
        this.name = aName;
        this.employer = aEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetency;
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

        String stringName = this.name;
        String stringEmployer = this.employer.getValue();
        String stringLocation = this.location.getValue();
        String stringPositionType = this.positionType.getValue();
        String stringCoreCompetency = this.coreCompetency.getValue();
        String noData = "Data not available";

        if (stringName == null) {
            stringName = noData;
        }

        if (stringEmployer == null) {
            stringEmployer = noData;
        }

        if (stringLocation == null) {
            stringLocation = noData;
        }

        if (stringPositionType == null) {
            stringPositionType = noData;
        }

        if (stringCoreCompetency == null) {
            stringCoreCompetency = noData;
        }

        return "\r\n" + "ID: " + this.getId() + "\r\n" + "Name: " + stringName + "\r\n" + "Employ" +
                "er: " + stringEmployer + "\r\n" + "Location: " + stringLocation + "\r\n" + "Position Type; " + stringPositionType + "\r\n" +
                "CoreCompetency: " + stringCoreCompetency + "\r\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId() &&
                Objects.equals(getName(), job.getName()) &&
                Objects.equals(getEmployer(), job.getEmployer()) &&
                Objects.equals(getLocation(), job.getLocation()) &&
                Objects.equals(getPositionType(), job.getPositionType()) &&
                Objects.equals(getCoreCompetency(), job.getCoreCompetency());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getEmployer(), getLocation(), getPositionType(), getCoreCompetency());
    }

    //====================================================================================================
    //  Class Getters and Setters:
    //====================================================================================================

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

}
