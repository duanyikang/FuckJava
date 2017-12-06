public class DoubleLink<T> {
    private class Node<T> {
        public Node<T> pre;
        public Node<T> next;
        public T data;

        public Node(T data, Node<T> pre, Node<T> next) {
            this.data = data;
            this.pre = pre;
            this.next = next;
        }
    }

    
}
