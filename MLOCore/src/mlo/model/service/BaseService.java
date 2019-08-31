package mlo.model.service;

import java.util.List;
import java.util.Map;

public interface BaseService<E> {

    public Map<String, String> create(E e) throws Exception;

    public E readById(Long id) throws Exception;

    public List<E> readByCriteria(Map<String, Object> criteria) throws Exception;

    public Map<String, String> update(E e) throws Exception;

    public void delete(Long id) throws Exception;

    public Map<String, String> validateForCreate(E e) throws Exception;

    public Map<String, String> validateForUpdate(E e) throws Exception;
}
