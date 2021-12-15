/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springframework.springcore.Ambiguity;

/**
 *
 * @author spring
 */
public class Addition {

	public Addition(int a, int b) {

		System.out.println("Inside Constructor INT");
	}

	public Addition(int a, double b) {

		System.out.println("Inside Constructor INT");
		System.out.println("Int a = " + a);
		System.out.println("double b = " + b);
		System.out.println(a + b);
	}

	public Addition(float a, float b) {

		System.out.println("Inside Constructor Float");
	}

	public Addition(double a, double b) {

		System.out.println("Inside Constructor Double");
	}

	public Addition(String a, String b) {
		System.out.println("Inside Constructor String");
	}

}
