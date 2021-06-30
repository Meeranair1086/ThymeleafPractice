package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.*;

@Entity
public class Event extends AbstractEntity {

    @NotBlank(message = "Name is required")
    @Size(min=3,max=50,message = "Name must be between 3 and 50 characters.")
    private String name;

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

    @ManyToOne
    @NotNull(message = "Category is required!")
    private EventCategory eventCategory;

    public Event(String name, String description, String contactEmail,String location,int numberOfAttendees,EventCategory eventCategory) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        this.numberOfAttendees=numberOfAttendees;
        this.eventCategory=eventCategory;

    }

    public Event(){}

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

    public EventCategory getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(EventCategory eventCategory) {
        this.eventCategory = eventCategory;
    }

    @Override
    public String toString() {
        return name;
    }



}
