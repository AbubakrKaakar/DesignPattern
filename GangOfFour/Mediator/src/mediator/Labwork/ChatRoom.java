/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator.Labwork;

/**
 *
 * @author sp20-bse-072
 */
import mediator.*;
import java.util.Date;

public class ChatRoom {
   public static void showMessage(IChatter Sender,IChatter[] receivers, String message){
      //System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
      for (IChatter receiver: receivers){
      receiver.ReceiveMessage(Sender,message);
      }
   
   }
}