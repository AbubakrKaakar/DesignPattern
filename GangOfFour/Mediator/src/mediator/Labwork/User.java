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
public class User implements IChatter{
   private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public User(String name){
      this.name  = name;
   }

    @Override
    public void SendMessage(IChatter receiver, String message) {
        
    }

    @Override
    public void ReceiveMessage(IChatter sender, String message) {
       
    }
}