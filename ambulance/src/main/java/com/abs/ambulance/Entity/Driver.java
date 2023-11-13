package com.abs.ambulance.Entity;

import jakarta.persistence.*;

@Entity
public class Driver {
	@Id
	private long driverId;
    private String driver_name;
    private String Phone_no;
    
    
    @OneToOne(cascade= CascadeType.ALL)
    private Ambulance ambulance;
    
    //private String id;
    
    private String driver_address;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getDriverId() {
		return driverId;
	}

	public void setDriverId(long driverId) {
		this.driverId = driverId;
	}

	public Ambulance getAmbulance() {
		return ambulance;
	}

	public void setAmbulance(Ambulance ambulance) {
		this.ambulance = ambulance;
	}

	private String status;

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

   

   
    public String getPhone_no() {
		return Phone_no;
	}

	public void setPhone_no(String phone_no) {
		Phone_no = phone_no;
	}

	public String getDriver_address() {
        return driver_address;
    }

    public void setDriver_address(String driver_address) {
        this.driver_address = driver_address;
    }
    
    

	public Driver(long driverId, String driver_name, String phone_no, Ambulance ambulance, String driver_address,
			String status) {
		super();
		this.driverId = driverId;
		this.driver_name = driver_name;
		Phone_no = phone_no;
		this.ambulance = ambulance;
		this.driver_address = driver_address;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", driver_name=" + driver_name + ", Phone_no=" + Phone_no
				+ ", ambulance=" + ambulance + ", driver_address=" + driver_address + ", status=" + status + "]";
	}

	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}

    
}