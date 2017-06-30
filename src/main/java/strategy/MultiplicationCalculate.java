package main.java.strategy;

/**
 * 乘法
 * @author Lichenyi
 * @date 2017/6/30 0030
 */
public class MultiplicationCalculate extends AbstractCalculation {

    private int paramA;
    private int paramB;

    public MultiplicationCalculate(int paramA, int paramB){
        this.paramA = paramA;
        this.paramB = paramB;
    }

    @Override
    int calculate() {
        return paramA * paramB;
    }
}
