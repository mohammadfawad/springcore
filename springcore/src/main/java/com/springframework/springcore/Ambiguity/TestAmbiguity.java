/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springframework.springcore.Ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 *
 * @author spring
 * By default spring container will look vales provided in Dependance injection
 * as strings, if there is string constructor it will invoke only string constructor
 * all other constructors will be invoked in order they are defined in code and will try
 * to convert parameter's according to first available constructor.
 */
public class TestAmbiguity {

    public static void main(String[] args) {

        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("/com/springframework/springcore/Ambiguity/AmbiguityConfig.xml");
            Addition addition = (Addition) context.getBean("addition");
            System.out.println("\n\n Ambiguity C - Schema c:property :: \n " + addition);

            Addition addition1 = (Addition) context.getBean("addition1");
            System.out.println("\n\n Ambiguity Contruct-args \n" + addition1);

            Addition addition2 = (Addition) context.getBean("addition2");
            System.out.println("\n\n Ambiguity C - Schema c:property ::  \n" + addition2);

        } catch (Exception e) {
            System.out.println("\n\n@@@\nFile Not Found OR ERROR!!\n" + e.toString());
        }

    }

}
