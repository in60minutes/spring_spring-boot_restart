package com.in60minutes.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class StudentApplication {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("D:\\Backend\\spring_spring-boot_restart\\spring-setter-di\\spring-bean-ci.xml");
        AddressCon ac = (AddressCon) context.getBean("student");
        System.out.println(ac.getStuCity());
        System.out.println(ac.getStuPin());
    }
}
