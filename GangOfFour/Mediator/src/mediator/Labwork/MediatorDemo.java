/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator.Labwork;

import mediator.*;

/**
 *
 * @author sp20-bse-072
 */
public class MediatorDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IChatter user = new User("User");
        IChatter teacher=new Teacher("Teacher");
        IChatter university=new University("COSMATS");
        IChatter [] group={user,teacher};
        user.SendMessage("Hello teacher welcome to class!",teacher);
        university.SendMessage("To all stuff! Friday is off due of emergency.",group);
        //User john = new User("John");
    }
    
}
