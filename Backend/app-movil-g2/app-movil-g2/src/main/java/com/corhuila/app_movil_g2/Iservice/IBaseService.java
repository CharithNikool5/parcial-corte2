package com.corhuila.app_movil_g2.Iservice;

import java.util.List;

import com.corhuila.app_movil_g2.entity.ABaseEntity;

public interface IBaseService<T extends ABaseEntity> {

    List<T> all();
    List<T> findByStateTrue();
    T findById(Long id) throws Exception;
    T save(T entity) throws Exception;
    void update(Long id, T entity) throws Exception;
    void delete(Long id) throws Exception;
}