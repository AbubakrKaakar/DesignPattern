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
public abstract class BaseEmployee implements IEmployee {
   String name;
   int salary;

    public BaseEmployee( int salary) {
        this.salary = salary;
    }
   
      @Override
    public int giveBonus(int percentage) {
       
       return (int)salary/percentage; 
    }
}
