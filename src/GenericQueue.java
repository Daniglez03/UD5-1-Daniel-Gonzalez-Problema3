public class GenericQueue<T> {
    private static final int INITIAL_CAPACITY = 5;

    private GenericCollection<T> collection = new GenericCollection<T>(INITIAL_CAPACITY);

    public void enqueue(T element) {
        collection.add(element);
    }

    public T dequeue() {
        return (T) collection.delete(0);
    }
}
