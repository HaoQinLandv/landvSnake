package cn.landv.demo.snake;
/*
* 设计成员变量
* 一条贪吃蛇是有一个一个的节点组成的，在传统的贪吃蛇应用中这个节点通常展示为一个黑色的小方块。
* 所以我们需要选择一种数据结构来表示这些相互连接的节点。不过在这之前，需要先定义出节点这个东西。
* 显然，表示节点状态就是它的X坐标和Y坐标，那么我们通过一个类来定义节点：
* 成员变量X和Y构成了一个Node的状态。注意这两个成员变量使用final修饰了，表示进行初始化赋值之后就不能改变。
* */
public class Node {
    private final int x;
    private final int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}
