package headfirst.designpatterns.observer.simple;

/**
 * @author rui
 * @date 2021/3/27
 */
public class Example {
    public static void main(String[] args) {
        SimpleSubject simpleSubject = new SimpleSubject();
        Observer observer = new SimpleObserver();

        observer.subscribe(simpleSubject);
        simpleSubject.setValue(75); // observer will receive message

        observer.unsubscribe(simpleSubject);
        simpleSubject.setValue(95);
    }
}
