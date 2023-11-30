package org.uv.tpcs_practica04.entity;


import java.util.List;

/**
 *
 * @author miran
 */
public interface IDAOGeneral <T,ID>{
    public T save (T t);
    public boolean delete(ID id);
    public T update(T t, ID id);
    public List<T> findAll();
    public T findByID(ID id);
}
