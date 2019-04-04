package cn.landv.demo.snake;

/*
 * Grid的数据成员
 * 表达一个棋盘的所有状态
 * 棋盘的方格是否被贪吃蛇覆盖
 * 食物的位置在哪个方格
 * 贪吃蛇目前的移动方向
 * 一个Grid创建后，它的长宽就是固定不变了，方格的覆盖可以用一个Boolean类型的二维数组来表示，如果一个Node被贪吃蛇覆盖，则对应坐标的数组元素为true，否则false。
 *Grid的构造函数
 * 创建一个棋盘时，需要做一些必要的初始化工作，比如：
 * 根据width和height初始化二维数组
 * 初始化一条贪吃蛇
 * 初始化食物
 * 这些工作都可以在构造函数中完成，构造函数就是用来初始化一个类的地方。
 * */
public class Grid {
    public final boolean status[][];
    private final int width;
    private final int height;

    private Snake sanke;

    /*    public Grid(int width, int height) {
            this.width = width;
            this.height = height;
        }*/
    //初始方向默认设置为向左。
    private Direction snakeDirection = Direction.LEFT;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
        status = new boolean[width][height];

        initSnake();
        createFood();
    }

    /*
     * 接下来看initSnake和createFood如何实现
     * 关键方法：初始化贪吃蛇
     * 我们可以根据棋盘大小来创建一只大小合适的贪吃蛇，并将其房子棋盘的某些位置。
     * 我们设定的规则如下：
     * 贪吃蛇的长度为棋盘宽度的三分之一
     * 贪吃蛇为水平放置，即包含的所有Node的Y坐标相同，Y坐标为棋盘垂直中间位置（即height/2),最左边的X为棋盘水平中间位置（即width/2）
     * 所有initSnake()的代码逻辑如下：
     */
    private  Snake initSnake(){
         snake = new Snake();
        //设置Snake的body

        //更新棋盘覆盖状态

        return  snake;
    }
    /*
    * 关键方法：随机创建食物
    * 随机创建食物，即随机生成食物的X坐标和Y坐标。我们可以使用java提供的Randow类来生成随机数。
    * 这里需要注意两点：
    * 生成的X坐标和Y坐标必须在有效的范围之内，不能超过棋盘大小
    * 食物的位置不能和贪吃蛇的位置重叠
    * */
    public Node createFood(){
        int x,y;
        //使用Randow设置X和Y
         food = new Node(x,y);
         return food;

    }
    /*
    * 关键方法：一次移动
    * 在Snake和move方法中，我们只是让贪吃蛇进行移动，移动方式是否有效以及移动后游戏是否继续并没有判断，
    * 我们吧这些逻辑都放到Grid类的实现中，有Grid类来驱动Snake的move操作，
    * Snake只管执行命令即可。
    * 每一次移动可以认为是游戏的下一步，因此我们将这个函数定义为NextRound（）。
    * 如果移动后能够继续，返回true，否则返回false。
    * public boolean nextRound(){
    *   按当前方向移动贪吃蛇
    *
    *   if(头部的位置是否有效){
    *       把原来move操作时删除的尾部添加回来
    *       创建一个新的食物
    *   }
    *   更新棋盘状态并返回游戏是否结束的标志
    * }
    *
    * */
}
