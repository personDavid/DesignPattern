package test;

import builder.BuilderPattern;

import java.io.InputStream;
import java.util.Date;

public class PatternTest {
    public static void main(String[] args) {
        BuilderPattern builderPattern = new BuilderPattern();
        builderPattern.name("David")
                .address("BJ")
                .age(25)
                .birthday(new Date());
        System.out.println(builderPattern);
    }
}
