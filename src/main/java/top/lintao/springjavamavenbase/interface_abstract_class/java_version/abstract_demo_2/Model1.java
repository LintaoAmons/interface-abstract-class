package top.lintao.springjavamavenbase.interface_abstract_class.java_version.abstract_demo_2;

import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper = true)
@Value
public class Model1 extends MyAbstractClass2 {

    public Model1(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {
        // extra constractor code
        new Model1("name", 1);
    }
}

