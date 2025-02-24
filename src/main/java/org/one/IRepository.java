package org.one;

import java.util.List;

public interface IRepository<T> {
    void save(T entity);
    List<T> findAll();
    T findById(int id);
}
