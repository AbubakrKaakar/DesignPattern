/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_pattern_lab_final;

/**
 *
 * @author wasiq
 */
public class Student implements Subscriber {
    String name, Department, RegNo;
    Teacher teacher;
    public void Update(){
        System.out.println("Student has been alerted about exam!");
    }
    
}
