package com.sac.backend.interfaces;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Maurício Freire
 * Date 04/06/2021 at 23:26
 * Created on IntelliJ IDEA
 */

@Repository
public interface Control<K> {
    ResponseEntity<List<K>> getAll();
    ResponseEntity<?> getById(Long id);
    ResponseEntity<K> post(K obj);
    ResponseEntity<?> put(K obj);
    ResponseEntity<?> delete(Long id);
}
