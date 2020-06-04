package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    //====================================================================================================
    //  Unit Tests for Job Class:
    //====================================================================================================

    @Test
    public void testSettingJobId() {

        // Arrange...
        Job job1 = new Job();
        Job job2 = new Job();

        // Act...
        int jobOneId = job1.getId();
        int jobTwoId = job2.getId();

        // Assert...
        assertNotEquals(jobOneId, jobTwoId);
        assertNotEquals(jobTwoId + 1, jobOneId);
        assertNotEquals(jobOneId - 1, jobTwoId);
        assertEquals((jobOneId + 1), jobTwoId);
        assertEquals((jobTwoId - 1), jobOneId);

    }

    @Test
    public void  testJobConstructorSetsAllFields() {

        // Arrange...
        String aName = "name";
        Employer aEmployer = new Employer();
        Location aLocation = new Location();
        PositionType aPositionType = new PositionType();
        CoreCompetency aCoreCompetency = new CoreCompetency();

        Job testJob = new Job(aName, aEmployer, aLocation, aPositionType, aCoreCompetency);

        // Act...
        int jobId = testJob.getId();
        String testName = testJob.getName();
        Employer testEmployer = testJob.getEmployer();
        Location testLocation = testJob.getLocation();
        PositionType testPositionType = testJob.getPositionType();
        CoreCompetency testCoreCompetency = testJob.getCoreCompetency();

        // Assert...
        assertEquals(aName, "name");
        assertNotEquals(aName, "john");
        assertTrue(testEmployer instanceof  Employer);
        assertTrue(testLocation instanceof  Location);
        assertTrue(testPositionType instanceof PositionType);
        assertTrue(testCoreCompetency instanceof CoreCompetency);

    }

    @Test
    public void testJobsForEquality() {

        // Arrange...
        Job jobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // Act...

        // Assert...
        assertNotEquals(jobOne, jobTwo);
    }

    @Test
    public void customToStringMethodShouldContainJobInformationWithBlankLineBeforeAndAfter() {

        // Arrange...
        Job jobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // Act...
        String actualInformation = jobOne.toString();
        String expectedInformation = "\r\n" + "ID: " + jobOne.getId() + "\r\n" + "Name: " + "Product tester" + "\r\n" + "Employ" +
                "er: " + "ACME" + "\r\n" + "Location: " + "Desert" + "\r\n" + "Position Type; " + "Quality control" + "\r\n" +
                "CoreCompetency: " + "Persistence" + "\r\n";

        // Assert...
        assertEquals(actualInformation, expectedInformation);
    }

    @Test
    public void customToStringMethodShouldAddDataNotAvailableIfEmpty() {

        // Arrange...
        Job jobOne = new Job("Product tester", new Employer(), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // Act...
        String actualInformation = jobOne.toString();
        String expectedInformation = "\r\n" + "ID: " + jobOne.getId() + "\r\n" + "Name: " + "Product tester" + "\r\n" + "Employ" +
                "er: " + "Data not available" + "\r\n" + "Location: " + "Desert" + "\r\n" + "Position Type; " + "Quality control" + "\r\n" +
                "CoreCompetency: " + "Persistence" + "\r\n";

        // Assert...
        System.out.println(actualInformation);
        System.out.println(expectedInformation);
        assertEquals(actualInformation, expectedInformation);
    }

}
