package com.stackroute;

//Bean or model or POJO(plain old java object)
//nothing other than attributes
//no business logic
public class Employee {
    int eid;
    String ename;
    String address;

    public Employee() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    /*We ain't using this for spring container but for developer created object concept*/
    public Employee(int eid, String ename, String address) {
        this.eid = eid;
        this.ename = ename;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void myInit(){
        System.out.println("---Object of Employee Initialized---");
    }

    public void myDestroy(){
        System.out.println("---Object of Employee Destroyed---");
    }
}

