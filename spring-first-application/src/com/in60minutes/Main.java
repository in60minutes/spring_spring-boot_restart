package com.in60minutes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new FileSystemXmlApplicationContext("D:\\Backend\\spring_spring-boot_restart\\spring-first-application\\spring.xml");
        Collage collage = (Collage) context.getBean("collage");
        collage.setCollageName("Pydah");
        collage.setCollageCity("Vizag");
        System.out.println(collage.getCollageCity());
        System.out.println(collage.getCollageName());
    }
}
