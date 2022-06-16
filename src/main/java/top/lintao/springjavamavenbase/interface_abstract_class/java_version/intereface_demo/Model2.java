package top.lintao.springjavamavenbase.interface_abstract_class.java_version.intereface_demo;

import lombok.Value;

@Value
// all fields clearly show as current class's fields
public class Model2 implements MyInterface {
    String name;
    int age;
    String other;

    public static void main(String[] args) {
        new Model2("name", 22, "other");
    }
}
