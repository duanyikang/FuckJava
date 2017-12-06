public class SingleLinkTest {

    public static void main(String[] args) {
        SingleLink l = new SingleLink();
        l.addNode("A");

        l.addNode("B");
        l.addNode("C");
        l.addNode("1");
        l.addNode("2");
        l.addNode("3");
        l.addNode("4");
        l.addNode("5");
        l.addNode("666");
        l.addNode("7");
        l.addNode("8");
        l.addNode("9");
        System.out.println("原链表：");
        l.print();
        String searchNode = "666";
        System.out.println("查找节点:" + searchNode);
        String result = l.searchNode(searchNode)?"找到!":"没找到!";
        System.out.println("查找结果：" + result);
        System.out.println("删除节点：" + searchNode);
        l.deleteNode(searchNode);
        System.out.println("删除节点后的链表：");
        l.print();

    }
}
