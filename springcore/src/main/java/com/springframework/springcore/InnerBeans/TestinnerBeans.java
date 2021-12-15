package com.springframework.springcore.InnerBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author spring
 */
public class TestinnerBeans {
    public static void main(String[] args) {
        //By Default Bean Scope is Singelton = {Single Object Created & Used Many Times in Application.}
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("/com/springframework/springcore/InnerBeans/InnerBeansConfig.xml");
            Employee employee = (Employee) context.getBean("employee");
            System.out.println(employee);
            
            System.out.println("\n\n-------[Singleton Scope]--------");
            System.out.println("\nBy Default Bean Scope is Singleton = {Single Object Created & Used Many Times in Application.}\n");
            System.out.println(" ObjectHashCode employee : " + employee.hashCode());
            
            Employee employee1 = (Employee) context.getBean("employee");
            System.out.println(" ObjectHashCode employee1 : " + employee1.hashCode());
            
            Employee employee2 = (Employee) context.getBean("employee");
            System.out.println(" ObjectHashCode employee2 : " + employee2.hashCode());
            
            System.out.println("\n\n--------[ProtoType Scope]------");
            
            Employee employeePrototype = (Employee) context.getBean("employeePrototype");
            System.out.println(employeePrototype);
            System.out.println("ObjectHashCode employeePrototype : " + employeePrototype.hashCode());
            
            Employee employeePrototype1 = (Employee) context.getBean("employeePrototype");
            System.out.println(employeePrototype1);
            System.out.println("ObjectHashCode employeePrototype1 : " + employeePrototype1.hashCode());
            
        } catch (Exception e) {
            System.out.println("@@@\nFile Not Found!!\n" + e.toString());
        }

    }
    
}
