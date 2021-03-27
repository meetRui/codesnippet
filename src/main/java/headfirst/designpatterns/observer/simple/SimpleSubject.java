package headfirst.designpatterns.observer.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rui
 * @date 2021/3/27
 */
public class SimpleSubject implements Subject {
    int value;
    private final List<Observer> observers;

    public SimpleSubject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(value);
        }
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }
}
