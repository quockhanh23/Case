package services;

public interface Management<T> {
    void add(T t);

    void edit(int id, T t);

    void delete(int id);

    int findIndexById(int id);

    void printList();

}
