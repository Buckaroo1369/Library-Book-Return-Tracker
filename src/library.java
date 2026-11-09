public class library {

    // Array ni siya nga class Jap
    private class ArrayList<T> {
        private Object[] data = new Object[10];
        private int size = 0;

        public void add(T item) {
            if (size == data.length) {
                Object[] newData = new Object[data.length * 2];

                for (int i = 0; i < size; i++) {
                    newData[i] = data[i];
                }

                data = newData;
            }

            data[size++] = item;
        }

        @SuppressWarnings("unchecked")
        public T get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }

            return (T) data[index];
        }

        public int size() {
            return size;
        }
    }

    // Kani para sa Queue
    private interface Queue<T> {
        void add(T item);
        T poll();
    }

    // Linked list
    private class LinkedList<T> implements Queue<T> {

        private class Node {
            T data;
            Node next;

            Node(T data) {
                this.data = data;
                next = null;
            }
        }

        private Node front;
        private Node rear;
<<<<<<< HEAD

        public void add(T item) {
            Node newNode = new Node(item);

            if (rear == null) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
        }

        public T poll() {
            if (front == null) {
                return null;
            }

            T item = front.data;
            front = front.next;

            if (front == null) {
                rear = null;
            }

            return item;
        }
    }

    // Attributes sa library
    private ArrayList<books> books;
    private ArrayList<borrowingRecord> records;
    private Queue<borrowingRecord> returnQueue;

    public library() {
        books = new ArrayList<>();
        records = new ArrayList<>();
        returnQueue = new LinkedList<>();
    }

    public void addBook(books book) {
        books.add(book);
    }

    public void addRecord(borrowingRecord record) {
        records.add(record);
    }

    // For linear search
    public books searchBook(String keyword) {
        for (int i = 0; i < books.size(); i++) {
            books book = books.get(i);

            if (book.getBookId().equalsIgnoreCase(keyword)
                    || book.getTitle().equalsIgnoreCase(keyword)) {
                return book;
            }
        }

        return null;
    }

    // I-return niya ang book sa queue
    public void addToReturnQueue(borrowingRecord record) {
        returnQueue.add(record);
    }

    // Process next returned book
    public borrowingRecord processNextReturn() {
        return returnQueue.poll();
    }

    public ArrayList<borrowingRecord> getRecords() {
        return records;
    }
}
=======
        
        public void 
    
    
    
    
}
}
>>>>>>> b16d729e038b1eb73a0225e8727cb6de8c3cfc90
