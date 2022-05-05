public class GenericCollection<T> {
        private Object data[] = null;
        private int length = 0;

        public GenericCollection(int initialCapacity) {
            data = new Object[initialCapacity];
        }

        public T getElement(int i) {
            return (T) data[i];
        }

        public int length() {
            return length;
        }

        public void insert(T element, int i) {

            if (length == data.length) {
                Object []aux = data;
                data = new Object[data.length * 2];

                for(int j = 0; j < length; j++) {
                    data[j] = aux[j];
                }

                aux = null;
            }

            for (int j = length - 1; j >= i; j--) {
                data[j + 1] = data[j];
            }

            data[i] = element;
            length++;
        }

        public int search(T element) {
            int i = 0;
            for (; i< length && !data[i].equals(element); i++);
            return i < length ? i : -1;
        }

        public void add(T element) {
            insert(element, length);
        }

        public T delete(int i) {
            Object aux = data[i];

            for (int j = i; j < length - 1; j++) {
                data[j] = data[j + 1];
            }

            length--;
            return (T) aux;
        }
}
