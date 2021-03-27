package headfirst.designpatterns.observer.simple;

/**
 * @author rui
 * @date 2021/3/27
 */
public class SimpleObserver implements Observer, DisplayElement {
    private int value;

    @Override
    public void subscribe(Subject subject) {
        subject.addObserver(this);
    }

    @Override
    public void unsubscribe(Subject subject) {
        subject.removeObserver(this);
    }

    @Override
    public void update(int value) {
        this.value = value;
        display();
    }

    @Override
    public void display() {
        System.out.println("Value: " + value);
    }
}
