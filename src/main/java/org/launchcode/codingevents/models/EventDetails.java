package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.validation.constraints.*;

@Entity
public class EventDetails extends AbstractEntity {
    @Size(max=500,message = "Description too long.")
    private String description;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    @NotBlank(message="Location cannot be left blank.")
    private String location;

    @Positive(message="Number of attendees must be one or more.")
    private int numberOfAttendees;

    @AssertTrue
    private boolean attendeesRegistration;

    public EventDetails(String description, String contactEmail, String location, int numberOfAttendees, boolean attendeesRegistration) {
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        this.numberOfAttendees = numberOfAttendees;
        this.attendeesRegistration = attendeesRegistration;
    }

    public EventDetails(){}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    public boolean isAttendeesRegistration() {
        return attendeesRegistration;
    }

    public void setAttendeesRegistration(boolean attendeesRegistration) {
        this.attendeesRegistration = attendeesRegistration;
    }
}
