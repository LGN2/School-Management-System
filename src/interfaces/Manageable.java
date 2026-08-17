package interfaces;

import java.util.List;

public interface Manageable {
    void add(T entity);
    boolean remove(String id);
    List<T> getAll();
}
