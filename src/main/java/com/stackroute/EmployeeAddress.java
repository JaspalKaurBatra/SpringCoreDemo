package com.stackroute;

public class EmployeeAddress {
    int eid;
    String ename;
    Address address;    //HAS-A Relationship

    public void myInit(){
        System.out.println("---Object of EmployeeAddress Initialized---");
    }

    public void myDestroy(){
        System.out.println("---Object of EmployeeAddress Destroyed---");
    }

    public EmployeeAddress(){

    }

    //constructor injection
    public EmployeeAddress(Address address) {
        this.address = address;
    }

    //setter injection
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "EmployeeAddress{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", address=" + address +
                '}';
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Address getAddress() {
        return address;
    }


}
