/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabWork;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sp20-bse-072
 */
public class HOD extends BaseEmployee  {
    List<IEmployee> subordinates=new ArrayList<IEmployee>();
    String Department;

    public HOD(int salary) {
        
        super(salary);
        
    }
    public void Add(IEmployee e){
    subordinates.add(e);
    }
    public void Remove(IEmployee e){
    subordinates.remove(e);
    }
     public List<IEmployee> getSubordinates(){
     return subordinates;
   }
}
