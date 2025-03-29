package com.in60minutes;

public class Main {
    public static void main(String[] args) {

        Address address = new Address();
        address.setCity("Hyderabad");
        address.setPinCode("500072");

        Employee employee = new Employee();
        employee.setEmpName("RajGopal");
        employee.setEmployeeId(2834);
        employee.setAddress(address);

        System.out.println(employee.getEmployeeId());
        System.out.println(employee.getEmpName());
        Address address1 =employee.getAddress();
        System.out.println(address1.getCity());
        System.out.println(address1.getPinCode());
    }
}
