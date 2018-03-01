package builder;

import java.util.Date;

public class BuilderPattern {
    //建造者模式，将对象的创建与表示分离
    //适用于一些比较重的对象，并且对象的创建有许多可选项
    private static String name;
    private static String pwd;
    private static Date birthday;
    private static int age;
    private static String gender;
    private static String address;

    public BuilderPattern() {
    }


    public BuilderPattern name(String name) {

        BuilderPattern.name = name;
        return this;
    }

    public BuilderPattern address(String address) {
        BuilderPattern.address = address;
        return this;
    }

    public BuilderPattern birthday(Date birthday) {
        BuilderPattern.birthday = birthday;
        return this;
    }

    public BuilderPattern age(int age) {
        BuilderPattern.age = age;
        return this;
    }

    public BuilderPattern gender(String gender) {
        BuilderPattern.gender = gender;
        return this;
    }

    public BuilderPattern pwd(String pwd) {
        BuilderPattern.pwd = pwd;
        return this;
    }

    @Override
    public String toString() {

        return "BuilderPattern："+"name-"+name+"address-"+address;
    }
}
