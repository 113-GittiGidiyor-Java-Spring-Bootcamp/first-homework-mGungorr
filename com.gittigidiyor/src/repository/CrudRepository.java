package repository;

import java.util.List;

public interface CrudRepository<T> {
    List<T> findAll();
    T findById(int id);
    void saveToDatabase(T object);
    void deleteCourseFromDatabase(int id);
}
