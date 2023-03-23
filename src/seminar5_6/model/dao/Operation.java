package seminar5_6.model.dao;

import java.util.List;

/**
 * Data Access Object (DAO) ����, � �������� ��� ������ � ��
 * @param <T> ��� ������� ��� ������/������.
 */
public interface Operation<T> {
    List<T> readAll();
    void saveAll(List<T> data);
}
