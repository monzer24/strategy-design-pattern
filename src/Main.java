import base.ParentClass;
import children.ChildClass1;
import children.ChildClass2;
import children.ChildClass3;
import strategy.StrategyClass1;
import strategy.StrategyClass2;
import strategy.StrategyClass3;

public class Main {

    public static void main(String[] args) {
        ParentClass class1 = new ChildClass1("class1");
        ParentClass class2 = new ChildClass2("class2");
        ParentClass class3 = new ChildClass3("class3");

        class1.setStrategy(new StrategyClass1());
        class2.setStrategy(new StrategyClass2());
        class3.setStrategy(new StrategyClass3());

        System.out.println(class1.parentMethod());
        System.out.println(class2.parentMethod());
        System.out.println(class3.parentMethod());

    }

}
