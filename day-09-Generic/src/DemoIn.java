public interface DemoIn<E> {

    void add(E e);

    E get(int index);

    int size();

    void clear();

    boolean isEmpty();

    boolean contains(E e);

    boolean remove(E e);
}
