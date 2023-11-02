/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermlab;

import java.util.Scanner;

/**
 *
 * @author sp20-bse-072
 */
public class userA extends User{

    public userA(MansehraCricket cricket, AyubCricket cricket2,AliPoorCricket cricket3) {
        this.cricket=cricket;
        this.cricket2=cricket2;
        this.cricket3=cricket3;
    }
     
      public void SelectMatch(){
          Scanner sc=new Scanner(System.in);
          int a;
          System.out.println("Please Select a match from live matches below!");
          System.out.println("Mansehra live match");
          System.out.println("Ali poor live match");
          System.out.println("Ayub live match");
          a=sc.nextInt();
          switch(a){
              case 1:
                  cricket.attach(this);
                   break;
              case 2:
                  cricket2.attach(this);
                  break;
              case 3:
                  cricket3.attach(this);
          }
      }
    @Override
    public void watch(String status) {
        System.out.println(status);
    }

    @Override
    public void stop() {
    cricket.detach(this);
    cricket2.detach(this);
    cricket3.detach(this);
    }
    
}
