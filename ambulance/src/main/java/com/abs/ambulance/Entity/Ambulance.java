package com.abs.ambulance.Entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

@Entity
public class Ambulance {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long ambulance_id;
    @Nonnull
    private String number_plate;
    @Nonnull
    private String ambulance_size;


    public long getAmbulance_id() {
        return ambulance_id;
    }

    public void setAmbulance_id(long ambulance_id) {
        this.ambulance_id = ambulance_id;
    }

    public String getNumber_plate() {
        return number_plate;
    }

    public void setNumber_plate(String number_plate) {
        this.number_plate = number_plate;
    }

    public String getAmbulance_size() {
        return ambulance_size;
    }

    public void setAmbulance_size(String ambulance_size) {
        this.ambulance_size = ambulance_size;
    }

	@Override
	public String toString() {
		return "Ambulance [ambulance_id=" + ambulance_id + ", number_plate=" + number_plate + ", ambulance_size="
				+ ambulance_size + "]";
	}

	public Ambulance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ambulance(long ambulance_id, String number_plate, String ambulance_size) {
		super();
		this.ambulance_id = ambulance_id;
		this.number_plate = number_plate;
		this.ambulance_size = ambulance_size;
	}

}
 