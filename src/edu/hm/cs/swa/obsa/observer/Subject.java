package edu.hm.cs.swa.obsa.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    //TODO add attribute
    private List<Observer> observers = new ArrayList<>();

    public void notifyObservers() {
        //TODO implement
        for(Observer el : observers)
            el.update();
    }

    public void registerObserver(Observer observer) {
        //TODO implement
        if(!observers.contains(observer))
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        //TODO implement
        observers.remove(observer);
    }

}
