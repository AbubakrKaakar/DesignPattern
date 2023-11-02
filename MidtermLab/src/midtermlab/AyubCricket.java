/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermlab;

import java.util.*;

/**
 *
 * @author sp20-bse-072
 */
public class AyubCricket implements LiveCricket{
List<User> users=new ArrayList();
    @Override
    public void attach(User user) {
    users.add(user);
    }

    @Override
    public void detach(User user) {
    users.remove(user);
    }
    @Override
    public void Notify() {
    for(User user: users){
    user.watch("Ayub Cricket: runs:125 Out: 4 Overs: 12");
    }
    }
    
}
