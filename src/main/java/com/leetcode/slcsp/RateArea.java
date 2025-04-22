package com.leetcode.slcsp;

public class RateArea {
    private String state;
    private String area;

    public RateArea(String state, String area) {
        this.state = state;
        this.area = area;
    }

    public String getState() {
        return this.state;
    }

    public String getArea() {
        return this.area;
    }

    @Override
    public String toString() {
        return "State: " + this.state + ", Area: " + this.area;
    }

    @Override
    public int hashCode() {
        return (int) this.state.hashCode() * this.area.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null) return false;
        if(this.getClass() != o.getClass()) return false;

        RateArea rateArea = (RateArea) o;
        return this.getState().equals(rateArea.getState())
            && this.getArea().equals(rateArea.getArea());
    }
}
