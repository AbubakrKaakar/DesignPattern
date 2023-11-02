/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermlab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sp20-bse-072
 */
public interface LiveCricket {
    //List<User> users=new ArrayList();
    void attach(User user);
    void detach(User user);
    void Notify();
}
