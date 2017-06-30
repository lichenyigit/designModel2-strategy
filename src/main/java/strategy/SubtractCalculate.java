package main.java.strategy;

/**
 * 减法
 * @author Lichenyi
 * @date 2017/6/30 0030
 */
public class SubtractCalculate extends AbstractCalculation {

    private int paramA;
    private int paramB;

    public SubtractCalculate(int paramA, int paramB){
        this.paramA = paramA;
        this.paramB = paramB;
    }

    @Override
    int calculate() {
        return paramA - paramB;
    }
}
