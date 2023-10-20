/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator.Labwork;

import java.util.Date;

/**
 *
 * @author sp20-bse-072
 */
public class University implements IChatter {
    public String name;
    //public String address;
    University (String name){
    this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void SendMessage(String message,IChatter... receiver) {
        ChatRoom.showMessage(this, receiver, message);
    }

    @Override
    public void ReceiveMessage(IChatter sender,String message) {
        System.out.println(new Date().toString() + " [" + sender.getName() + "] : " + message);
    }
    
}
