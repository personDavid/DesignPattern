package singleton;

public class SingletonPattern3 {
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
    private SingletonPattern3() {
    }

    //静态内部类
    private static class Instance {
        private static final SingletonPattern3 ss = new SingletonPattern3();
    }

    public static SingletonPattern3 getInstance() {
        return Instance.ss;
    }
}
