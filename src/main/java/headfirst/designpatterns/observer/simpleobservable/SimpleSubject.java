package headfirst.designpatterns.observer.simpleobservable;

import java.util.Observable;

/**
 * @author rui
 * @date 2021/3/27
 */
public class SimpleSubject extends Observable {
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        setChanged();
        notifyObservers();
//        notifyObservers(value);
    }
}
