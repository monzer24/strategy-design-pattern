package children;

import base.ParentClass;

public class ChildClass3 extends ParentClass {

    public ChildClass3(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

}
