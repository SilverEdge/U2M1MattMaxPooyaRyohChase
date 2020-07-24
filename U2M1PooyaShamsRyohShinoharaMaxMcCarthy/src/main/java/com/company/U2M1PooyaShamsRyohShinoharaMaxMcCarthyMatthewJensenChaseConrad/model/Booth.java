package com.company.U2M1PooyaShamsRyohShinoharaMaxMcCarthyMatthewJensenChaseConrad.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name="booths")
public class Booth {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int boothId;

    private Integer numSeats;
    private boolean isAvailable;

    public int getBoothId() {
        return boothId;
    }

    public void setBoothId(int boothId) {
        this.boothId = boothId;
    }

    public Integer getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(Integer numSeats) {
        this.numSeats = numSeats;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    @Override
    public String toString() {
        return "Booth{" +
                "boothId=" + boothId +
                ", numSeats=" + numSeats +
                ", isAvailable=" + isAvailable +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booth booth = (Booth) o;
        return boothId == booth.boothId &&
                isAvailable == booth.isAvailable &&
                Objects.equals(numSeats, booth.numSeats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boothId, numSeats, isAvailable);
    }
}
