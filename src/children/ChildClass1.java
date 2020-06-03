package children;

import base.ParentClass;

public class ChildClass1 extends ParentClass {

    public ChildClass1(String name) {
        this.name = name;

    }

    private String name;

    public String getName() {
        return name;
    }
}
