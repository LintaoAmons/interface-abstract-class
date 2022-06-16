package top.lintao.springjavamavenbase.interface_abstract_class.java_version.abstract_damo_1;

import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper = false) // extra annotation
@Value
public class Model1 extends MyAbstractClass1 {
    String name;
    int age;

    public static void main(String[] args) {
        new Model1("name", 11);
    }
}
