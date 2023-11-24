/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labwork1;

/**
 *
 * @author SP20-BSE-072
 */
public class LightReplaceCommand implements Command{

    private Light light;

    public LightReplaceCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        
        light.switchOff();
        System.out.println("Light is off");
        light=new Light();
        System.out.println("Light is replaced");
        light.switchOn();
        System.out.println("Light is On");
    }
    
}
