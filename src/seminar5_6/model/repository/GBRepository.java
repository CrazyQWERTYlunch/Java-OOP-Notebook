package seminar5_6.model.repository;

import seminar5_6.model.User;

import java.util.List;
import java.util.Optional;

/**
 * �����������, ��� ���������� CreateReadUpdateDelete (CRUD) ��������
 * @param <E> ��� ������ ������
 * @param <I> ��� ID ������ ������ E
 */
public interface GBRepository<E, I> {
    List<E> findAll();
    E create(E e);
    Optional<E> findById(I id);
    Optional<E> update(I id, E e);
    Optional<User> delete(I id);
}
