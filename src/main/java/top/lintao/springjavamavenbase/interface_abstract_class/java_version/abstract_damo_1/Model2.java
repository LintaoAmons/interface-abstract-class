package top.lintao.springjavamavenbase.interface_abstract_class.java_version.abstract_damo_1;

import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper = false)
@Value
public class Model2 extends MyAbstractClass1 {
    String name;
    int age;
    String other;

    public static void main(String[] args) {
        new Model2("name", 11, "other");
    }
}
