package prototype;

public class Prototype implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //注，原型模式与单例模式冲突不能一起使用
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype();
        for (int i = 0; i < 99; i++) {
            Prototype clone = (Prototype) prototype.clone();
            System.out.println(clone);
        }
    }
}
