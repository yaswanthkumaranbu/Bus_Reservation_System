package com.bookbus.busreserve.model;

public class Bus {

    private String name;
    private String busNo;
    private boolean AC;
    private int cost;
    private String type;
    private int capacity;
    private String color;

    private String destination;
    private String start;

    private BusDrivers busDrivers;

    public Bus(String name, String busNo, int cost, boolean aC, String type, int capacity, String color, String destination,
            String start, BusDrivers busDrivers) {
        super();
        this.name = name;
        this.busNo = busNo;
        this.cost = cost;
        AC = aC;
        this.type = type;
        this.capacity = capacity;
        this.color = color;
        this.destination = destination;
        this.start = start;
        this.busDrivers = busDrivers;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public BusDrivers getBusDrivers() {
        return busDrivers;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public Bus(String name, String busNo, boolean aC, String type, int capacity, String color) {
        this.name = name;
        this.busNo = busNo;
        AC = aC;
        this.capacity = capacity;
        this.type = type;
        this.color = color;
    }

    public String getBusNo() {  // Accessor
        return busNo;
    }

    public void setBusNo(String busNo) {  // Mutator
        this.busNo = busNo;
    }

    public boolean isAC() {
        return AC;
    }

    public void setAC(boolean AC) {
        this.AC = AC;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String displayBusInfo() {
        return "Bus no :" + busNo + "\nAC :" + AC + "\nCapacity :" + capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
