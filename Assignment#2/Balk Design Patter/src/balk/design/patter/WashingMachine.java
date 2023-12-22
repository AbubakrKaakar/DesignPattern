/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balk.design.patter;

/**
 *
 * @author abuba
 */
public class WashingMachine {
    private boolean isWashing = false;

    public void wash() {
        if (isWashing) {
            System.out.println("Cannot wash if the machine has been already washing!");
        } else {
            isWashing = true;
            System.out.println("Washing started.");

            // Simulate washing process by waiting for 2 seconds
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Washing completed.");
            isWashing = false;
        }
    }
}
