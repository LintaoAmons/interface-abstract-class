package top.lintao.springjavamavenbase.regex_demo;

import org.junit.jupiter.api.Test;

class DemoUnitTestDrive {
    @Test
    void should_do() {
        new Demo().split();
    }

    @Test
    void should_match() {
        new Demo().match();
    }

    @Test
    void should_group() {
        new Demo().group();
    }

    @Test
    void should_test() {
        new Demo().test();
    }
}