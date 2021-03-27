package headfirst.designpatterns.observer.simpleobservable;

import java.util.Observer;

/**
 * @author rui
 * @date 2021/3/27
 */
public class Example {
    public static void main(String[] args) {
        SimpleSubject simpleSubject = new SimpleSubject();
        SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);

        simpleSubject.setValue(90);

        simpleObserver.unsubscribe();
        simpleSubject.setValue(75);
    }
}
