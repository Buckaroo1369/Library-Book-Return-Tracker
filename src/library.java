
public class library {
    
    //Array ni siya nga class Jap
    private class ArrayList<T>{
        private Object[] data = new Object[10];
        private int size = 0;
        
        public void add(T item) {
            if (size == data.length) {
                Object[] newData = new Object[data.length * 2];
                
                for(int i = 0; i < size; i++) {
                    newData[i] = data[i];
                }
                
                data = newData;
            }
            
            data[size++] = item;
        }
        
        public T get(int index) {
            return (T) data[index];
        }
        
        public int size() {
            return size;
        }        
        
    }
    
    //Kani para sa Queue
    private interface Queue<T> {
        void add(T item);
        T poll();
    }
    
    //Linked list
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
        
        public void 
    
    
    
    
}
}
