package per.study.thread.design.chapter7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableTest {
    private final int age;
    private final String name;

    private final List<String> list;

    public ImmutableTest(int age, String name) {
        this.age = age;
        this.name = name;
        list = new ArrayList<>();
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public List<String> getList() {
        return Collections.unmodifiableList(list);
    }
}
