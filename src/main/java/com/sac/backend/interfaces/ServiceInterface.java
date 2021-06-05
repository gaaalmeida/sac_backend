package com.sac.backend.interfaces;

import java.util.List;

/**
 * @author Maurício Freire
 * Date 03/06/2021 at 18:17
 * Created on IntelliJ IDEA
 */

public interface ServiceInterface<T> {
    T create(T obj);
    T findById(Long id);
    List<T> findAll();
    boolean update(T obj);
    boolean delete(Long id);
}
