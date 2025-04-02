package com.in60minutes.bothfiles;

import com.in60minutes.basic.Address;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class StudentMain {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("D:\\Backend\\spring_spring-boot_restart\\spring-setter-di\\collage-bean.xml");

        Student student = (Student) context.getBean("student");
        System.out.println(student.getStudentId());
        System.out.println(student.getStudentName());
        System.out.println(student.getMobileNo());

        CollageAddress ca = student.getCollageAddress();
        System.out.println(ca.getCollageCity());
        System.out.println(ca.getState());

        ca.getAll();
    }
}
