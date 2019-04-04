package cn.landv.demo.snake;


import java.util.LinkedList;
/*
* 为了表示相互连接在一起的节点，我们可以为Snake定义一个集合类型的成员变量，让集合来保存所有节点。
* 你可能会说也可以使用数组来存储一组节点，但是数组的尺寸是固定的，通常情况下程序总是在运行时根据条件来创建对象，
* 我们可能无法预知将要创建对象的个数（贪吃蛇的身体会不断变长），
* 这时java的集合（Collection）类了（通常也称集合为容器）就是一个很好的选择，因为它们可以帮助我们方便地组织和管理一组对象。
* 常用的集合类包括Map、List和Set，这里显然LIst是比较合适的，它提供了一系列操作一个元素序列的方法。
* 接下来要考虑的问题是选择哪一种List，因为List也有许多种，常见的有ArrayList和LinkedList。这两者的主要不同在与：
* ArrayList：通过下标随机访问元素快，但是插入、删除元素较慢。
* LinkedList：插入、删除和移动元素快，但是通过下标随机访问元素性能较低。
* 其实ArrayList是局域数组实现的，而LinkedList是基于连表实现的。这两种数据结构的特点决定了这两个容器的不同之处。
* 结合我们自己的应用场景可以发现，贪吃蛇不断变长，经常做插入操作，而且我们不需要随机去访问贪吃蛇中的某一个节点。
* 因此，果断选择LinkedList。
* 有了这个思考过程，接下来Snake的成员变量就很清晰了
*
* Snake应该提供什么方法来操作自己的状态呢？贪吃蛇有两种情况下会有状态的变化，一种是迟到食物的时候，一种就是做了一次移动的时候。
* 此外，贪吃蛇也需要定一些查询自己状态和信息的公有方法。比如获取贪吃蛇的头部，获取贪吃蛇的body，对应可以加入这些方法。
* 一开始可能定义的方法不够完整，没关系，在编码过程中你会很自然地发现需要Snake提供更多的方法来完成特定功能，这个时候你再添加即可。
* 把这些方法加入进去之后，Snake的代码看起来就丰富多了：
* */
public class Snake {
    private LinkedList<Node> body = new LinkedList<>();

    public  Node eat(Node food){
        //如果food与头部相邻，则将food这个Node加入到body中，返回food
        //否则不做任何操作，返回null

        if (isNeighbor(body.getFirst(), food)) {
            // 相邻情况下的处理
        }
    }

    private boolean isNeighbor(Node a, Node b) {
        return Math.abs(a.getX() - b.getX()) + Math.abs(a.getY() - b.getY()) == 1;
    }

    public  Node move(Direction direction){
        //根据方向更新贪吃蛇的body
        //返回移动之前的尾部Node
    }

    public  Node getHead(){
        return  body.getFirst();
    }
    public  Node addTail(Node area){
        this.body.addLast(area);
        return area;
    }
    public  LinkedList<Node> getBody(){
        return  body;
    }

}
