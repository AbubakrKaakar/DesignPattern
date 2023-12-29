/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_pattern_lab_final;

/**
 *
 * @author wasiq
 */
public class ConcreteMediator implements Mediator {
    Teacher teacher;
    Admin admin;
    Student student;
    Parent parent;
    @Override
    public void Notify() {
        reactOnAdmin();
        reactOnParent();
        reactOnParent();
    }
    private void reactOnAdmin(){}
    private void reactOnParent(){}
    private void reactOnStudent(){}
    
    
}
