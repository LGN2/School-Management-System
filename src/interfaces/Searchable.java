package interfaces;

import java.util.List;

public interface Searchable {
    List<T> search(String keyword);
    T searchById(String id);
}
