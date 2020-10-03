package MO;

public interface AbstractFactory<T> {
    T create(String type);
}
