/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springframework.springcore.PropertyPlaceHolder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 *
 * @author 
 */
public class TestPropertyPlaceHolder {
    public static void main(String args[]){
    
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("/com/springframework/springcore/PropertyPlaceHolder/dbProperties.xml");
            PropertiesDAO propertiesDAO = (PropertiesDAO) context.getBean("PropertiesDAO");
            System.out.println("\n\n Read Properties from DataBase Server Property file :: \n " + propertiesDAO);

            

        } catch (Exception e) {
            System.out.println("\n\n@@@\nFile Not Found OR ERROR!!\n" + e.toString());
        }
    }
}


