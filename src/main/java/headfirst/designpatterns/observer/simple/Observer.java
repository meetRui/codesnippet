package headfirst.designpatterns.observer.simple;

/**
 * @author rui
 * @date 2021/3/27
 */
public interface Observer {
    void subscribe(Subject subject);
    void unsubscribe(Subject subject);
    void update(int value);
}
