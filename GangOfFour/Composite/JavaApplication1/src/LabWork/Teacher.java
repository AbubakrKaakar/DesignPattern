/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabWork;

/**
 *
 * @author sp20-bse-072
 */
public abstract class Teacher extends BaseEmployee{
    String Qualification;
    String status;
 public Teacher(String name, double salary) {
        super(name, salary);
    }
    
}
