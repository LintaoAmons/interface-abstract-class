package top.lintao.springjavamavenbase.interface_abstract_class.java_version.abstract_demo_2;

import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper = true) // extra annotation to include parent class into equals which require parent class have equals method
@Value
public class Model2 extends MyAbstractClass2 {
    // hidden information:: there is two more fields extends from parent class
    String other;

    public Model2(String name, int age, String other) {
        super(name, age);
        this.other = other;
    }


    public static void main(String[] args) {
        new Model2("name", 22, "other");
    }
}
