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
public class University implements IChatter {
    public String name;
    public String address;
    @Override
    public void SendMessage(IChatter receiver,String message) {
        
    }

    @Override
    public void ReceiveMessage(IChatter sender,String message) {
        
    }
    
}
