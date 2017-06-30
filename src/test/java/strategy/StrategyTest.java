package test.java.strategy;

import main.java.strategy.*;

/**
 * @author Lichenyi
 * @date 2017/6/30 0030
 */
public class StrategyTest {

    public static void main(String args[]) {
        int paramA = 4;
        int paramB = 2;
        Context context = new Context(new AddCalculate(paramA, paramB));
        System.out.println("加法 "+context.getResult());
        Context contextSub = new Context(new SubtractCalculate(paramA, paramB));
        System.out.println("减法 "+contextSub.getResult());
        Context contextMulti = new Context(new MultiplicationCalculate(paramA, paramB));
        System.out.println("乘法 "+contextMulti.getResult());
        Context contextDev = new Context(new DevisionCalculate(paramA, paramB));
        System.out.println("除法 "+contextDev.getResult());
    }

}
