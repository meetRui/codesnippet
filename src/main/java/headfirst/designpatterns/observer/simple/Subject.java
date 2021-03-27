package headfirst.designpatterns.observer.simple;

/**
 * @author rui
 * @date 2021/3/27
 */
public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
