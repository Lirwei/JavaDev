package per.study.thread.design.chapter8;

public interface Future<T> {
    T get() throws InterruptedException;
}
