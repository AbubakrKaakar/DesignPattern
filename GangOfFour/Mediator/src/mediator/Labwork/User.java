/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator.Labwork;

import java.util.Date;
import mediator.*;

/**
 *
 * @author sp20-bse-072
 */
public class User implements IChatter{
   private String name;

   @Override
   public String getName() {
      return name;
   }

   public User(String name){
      this.name  = name;
   }

    @Override
    public void SendMessage( String message,IChatter... receiver) {
        ChatRoom.showMessage(this, receiver, message);
    }

    @Override
    public void ReceiveMessage(IChatter sender, String message) {
//        System.out.println("The message has been sent from ");
        System.out.println(new Date().toString() + " [" + sender.getName() + "] : " + message);
    }
}