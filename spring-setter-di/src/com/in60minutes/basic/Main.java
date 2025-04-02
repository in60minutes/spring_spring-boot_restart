package com.in60minutes.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("D:\\Backend\\spring_spring-boot_restart\\spring-setter-di\\spring-config.xml");
        Address address = (Address) context.getBean("address");
        System.out.println(address.getCity());
        System.out.println(address.getPinCode());

        Address co = (Address) context.getBean("company");
        System.out.println(co.getCompany());
    }
}
