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
public interface IChatter {
    void SendMessage();
    void ReceiveMessage(IChatter sender);
}
