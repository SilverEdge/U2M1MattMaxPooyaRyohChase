package com.company.U2M1PooyaShamsRyohShinoharaMaxMcCarthyMatthewJensenChaseConrad.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "guests")

public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int guestId;

    private String firstName;
    private String lastName;
    private Integer numInParty;


    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getNumInParty() {
        return numInParty;
    }

    public void setNumInParty(Integer numInParty) {
        this.numInParty = numInParty;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "guestId=" + guestId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", numInParty=" + numInParty +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return guestId == guest.guestId &&
                Objects.equals(firstName, guest.firstName) &&
                Objects.equals(lastName, guest.lastName) &&
                Objects.equals(numInParty, guest.numInParty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guestId, firstName, lastName, numInParty);
    }
}
