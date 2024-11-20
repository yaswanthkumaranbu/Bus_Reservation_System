package com.bookbus.busreserve.model;

public class BusDrivers {
	 private String driverName;
	 private int driverAge;
	 private long driverPhone;
	 
	 public BusDrivers(String driverName, int driverAge, long driverPhone) {
	        this.driverName = driverName;
	        this.driverAge = driverAge;
	        this.driverPhone = driverPhone;
	    }

	    public String getDriverName() {
	        return driverName;
	    }

	    public void setDriverName(String driverName) {
	        this.driverName = driverName;
	    }

	    public int getDriverAge() {
	        return driverAge;
	    }

	    public void setDriverAge(int driverAge) {
	        this.driverAge = driverAge;
	    }

	    public long getDriverPhone() {
	        return driverPhone;
	    }

	    public void setDriverPhone(long driverPhone) {
	        this.driverPhone = driverPhone;
	    }
	    
}
