package children;

import base.ParentClass;

public class ChildClass2 extends ParentClass {

    public ChildClass2(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

}
