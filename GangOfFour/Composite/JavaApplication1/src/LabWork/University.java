/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabWork;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sp20-bse-072
 */
public class University {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(double bonus) {
        for (Observer observer : observers) {
            observer.update(bonus);
        }
    }
}