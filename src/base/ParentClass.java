package base;

import strategy.StrategyInterface;

public class ParentClass {

    StrategyInterface strategy;

    public String parentMethod(){
        return strategy.method1();
    }

    public void setStrategy(StrategyInterface strategy) {
        this.strategy = strategy;
    }
}
