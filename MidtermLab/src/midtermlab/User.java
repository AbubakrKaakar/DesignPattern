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
public abstract class User {
    //List<LiveCricket> livecricket=new ArrayList();
    protected LiveCricket cricket;
     protected LiveCricket cricket2;
      protected LiveCricket cricket3;
    public abstract void watch(String status);
    public abstract void stop();
}
