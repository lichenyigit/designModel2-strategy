package test.java.strategy;

import main.java.strategy.AddCalculate;
import main.java.strategy.Context;

/**
 * @author Lichenyi
 * @date 2017/6/30 0030
 */
public class StrategyTest {

    public static void main(String args[]) {
        int paramA = 4;
        int paramB = 2;
        Context context = new Context(new AddCalculate(paramA, paramB));
        System.out.println(context.getResult());
    }

}
