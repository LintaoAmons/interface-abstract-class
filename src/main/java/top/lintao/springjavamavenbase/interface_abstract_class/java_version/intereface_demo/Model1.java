package top.lintao.springjavamavenbase.interface_abstract_class.java_version.intereface_demo;

import lombok.Value;

@Value
// simple and clean
public class Model1 implements MyInterface {
    String name;
    int age;

    public static void main(String[] args) {
        // No extract constructor code
        new Model1("name", 1);
    }
}

