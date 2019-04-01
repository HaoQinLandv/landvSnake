package cn.landv.demo.snake;
/*
* 贪吃蛇前进的方向
* */
//完全代码
/*public class Direction {

    public static final int up = 0;
    public static final int RIGHT = 1;
    public static final int DOWN = 2;
    public static final int LEFT = 3;

}*/

//精简代码
/*
* 通过枚举的方式来定义方向代码，相比前面的代码简洁了许多。
* 其实UP、RIGHT等枚举值默认就是public、static和final的。
* */

/*public enum Direction{
    UP,
    RIGHT,
    DOWN,
    LEFT;
}*/

/*
* 枚举最典型的使用场景就是Switch语句，比如根据贪吃蛇移动的方法来变化它的坐标未知：
*   switch (direction) {
        case UP:
            //向上移动
            break;
        case RIGHT:
            //向右移动
            break;
        case DOWN:
            //向下移动
            break;
        case LEFT:
            //向左移动
            break;
    }
* */

/*
* 贪吃蛇前进的方向
* 方向有时需要进行运算，因此赋予一定的值操作起来会更加方便，比如判断两个方向是否相邻。
* 这里我们给Direction中的每一个取值管理一个整数值。这是需要给枚举添加成员量、方法和构造函数了。
* 我们说过，ENUM是一种特殊的Class，座椅做这些事情毫无压力。
* */
public enum Direction{
    UP(0),
    RIGHT(1),
    DOWN(2),
    LEFT(3);
    //成员变量
    private final int directionCode;

    //成员方法
    public int directionCode(){
        return directionCode;
    }
    //构造函数
    Direction(int directionCode){
        this.directionCode=directionCode;
    }
}
/*
* 上面的代码添加了一个私有的成员directionCode作为方向的整数代码，在后面的练习中你会看到这样的代码对于运算的话会非常方便。
* 成员方法directionCode()使得外面可以方法到方向的整数代码，比如
* int code =Direction.UP.directionCode();
* 增加成员变量后，构造函数就需要传入一个代码参数进行初始化。注意枚举的构造函数不能使用Public修饰。
* 否则在外部也能创建新的枚举值岂不是乱套了。
* 这是枚举的定义就可以调用新的构造函数了，传入一个整数值来初始化directionCode，比如UP(0)j就表示向上的方向的整数代码为0。
*
* */

/*
* 枚举类有一个name()方法和toString()返回一样的值，所不同的是toString()可以被重载，而name()方法是final的，不能被重载。
* 枚举类还有一个valueOf()方法，这个方法和toString方法是相对应的，调用valueOf("UP")将返回Direciont.UP。
* 因此在重写toString()方法时，一般也要相应重写valueOf()方法。
* ordinal()：返回枚举值在枚举类中的顺序，这个顺序根据枚举值声明的顺序而定，这里Direciont.RIGHT.ordinal()返回1.
* 枚举可以实现接口，但是不能集成，原因在于任何枚举已经集成来自java.lang.Enum,而java是不支持多继承的。
* */