package singleton;

public class SingletonPattern1 {
    /*设计模式原则
    开闭原则 对代码修改是关闭的，对代码扩展是开放的
    单一职责
    面向接口编程
    接口隔离
    尽量使用组合少使用集成
    将不变的部分封装起来，将改变的部分抽取出来
     */
    //单例模式，23种设计模式中属于创建型模型
    //单例模式，单例类只有一个实例，必须自己创建自己的的唯一实例，单例类必须给所有其他对象提供这一实例
    //私有化构造器
    private SingletonPattern1(){}
    //饿汉式
    /*
    是否 Lazy 初始化：否
    是否多线程安全：是
    实现难度：易
    描述：这种方式比较常用，但容易产生垃圾对象。
    优点：没有加锁，执行效率会提高。
    缺点：类加载时就初始化，浪费内存。
    它基于 classloder 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化，虽然导致类装载的原因有很多种，在单例模式中大多数都是调用 getInstance 方法， 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化 instance 显然没有达到 lazy loading 的效果。
     */
    private static SingletonPattern1 s1=new SingletonPattern1();

    public static SingletonPattern1 getInstance(){
        return s1;
    }
}
