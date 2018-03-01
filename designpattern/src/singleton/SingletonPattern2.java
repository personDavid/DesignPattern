package singleton;

public class SingletonPattern2 {
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
    private SingletonPattern2() {
    }

    //
    private static SingletonPattern2 s1 = null;

    /*懒汉式，线程不安全
    是否 Lazy 初始化：是
    是否多线程安全：否
    实现难度：易
    */
    public static SingletonPattern2 getInstance() {
        if (s1 == null)
            s1 = new SingletonPattern2();
        return s1;
    }

    //线程安全，性能低下
    public synchronized static SingletonPattern2 getInstance2() {
        if (s1 == null)
            s1 = new SingletonPattern2();
        return s1;
    }

    //双重检查
    public synchronized static SingletonPattern2 getInstance3() {
        if (s1 == null) {
            synchronized (SingletonPattern2.class) {
                if (s1 == null)
                    s1 = new SingletonPattern2();
            }
        }
        return s1;
    }

}
