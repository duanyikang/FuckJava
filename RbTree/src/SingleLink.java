public class SingleLink {

    class Node {
        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
        }

        /**
         * 添加节点
         *
         * @param node
         */
        public void add(Node node) {
            if (this.next == null) {
                this.next = node;
            } else {
                this.next.add(node);
            }
        }

        /**
         * 删除
         *
         * @param previous
         * @param data
         */
        public void delete(Node previous, String data) {
            if (this.data.equals(data)) {
                if (this.next != null) {
                    previous.next = this.next;
                } else {
                    previous.next = null;
                }
            } else {
                if (this.next != null) {
                    this.next.delete(this, data);
                }
            }
        }

        /**
         * 查找
         *
         * @param data
         * @return
         */
        public boolean search(String data) {
            if (this.data.equals(data)) {
                return true;
            } else if (this.next != null) {
                return this.next.search(data);
            }
            return false;
        }

        /**
         * 打印节点
         */
        public void print() {
            if (this.next != null) {
                System.out.println(this.data + "-->");
                this.next.print();
            } else {
                System.out.println(this.data + "\n");
            }
        }
    }

    private Node root;

    public void addNode(String data) { // 根据内容添加节点
        Node newNode = new Node(data); // 要插入的节点
        if (this.root == null) { // 没有头节点，则要插入的节点为头节点
            this.root = newNode;
        } else { // 如果有头节点，则调用节点类的方法自动增加
            this.root.add(newNode);
        }
    }

    public void print() { // 展示列表的方法
        if (root != null) { // 当链表存在节点的时候进行展示
            this.root.print();
        }
    }

    public boolean searchNode(String data) { // 在链表中寻找指定内容的节点
        return root.search(data); // 调用内部搜索节点的方法
    }

    public void deleteNode(String data) { // 在链表中删除指定内容的节点
        if (root.data.equals(data)) { // 如果是头节点
            if (root.next != null) {
                root = root.next;
            } else {
                root = null;
            }
        } else {
            root.next.delete(this.root, data);
        }
    }


}
