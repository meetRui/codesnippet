package headfirst.designpatterns.observer.simpleobservable;

import headfirst.designpatterns.observer.simple.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author rui
 * @date 2021/3/27
 */
public class SimpleObserver implements Observer, DisplayElement {
    Observable observable;
    private int value;

    public SimpleObserver(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void unsubscribe() {
        observable.deleteObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg != null) {
            value = (int) arg;
            display();
        } else {
            if (o instanceof SimpleSubject) {
                SimpleSubject simpleSubject = (SimpleSubject) o;
                value = simpleSubject.getValue();
                display();
            }
        }
    }

    @Override
    public void display() {
        System.out.println("Value: " + value);
    }
}
