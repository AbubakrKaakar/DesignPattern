/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_pattern_lab_final;

/**
 *
 * @author wasiq
 */
public class Parent implements Subscriber{
    String name;
    int Parent_ID;
    Teacher teacher;
    public void Update(){
        System.out.println("Parent has been alerted about exam!");
    }
    
}
