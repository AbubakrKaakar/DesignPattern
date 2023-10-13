/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author abuba
 */
public class Template {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
        // TODO code application logic here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       
        //Network network = null;
        login();
        System.out.println("1 - Continue\n"
        +"2 - Stop");
        int choice=Integer.parseInt(reader.readLine());
        if(choice==1){
        login();
        }
    
    }
    public static void login() throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();

        // Enter the message.
        System.out.print("Input message: ");
        System.out.println("Write the Description");
        Message message =new Message();
                message.Description=reader.readLine();
                message.NetworkType=4;
                


        if(message.NetworkType==1)
        new Facebook(userName,password).post(message.Description);
        else if(message.NetworkType==2)
        new Twitter(userName,password).post(message.Description);
        else if (message.NetworkType==3)
        new LinkedIn(userName,password).post(message.Description);
        else
        {new Facebook(userName,password).post(message.Description);
        new Twitter(userName,password).post(message.Description);
        new LinkedIn(userName,password).post(message.Description);
        }
    }
    
}
