package main.java.strategy;

/**
 * 除法
 * @author Lichenyi
 * @date 2017/6/30 0030
 */
public class DevisionCalculate extends AbstractCalculation {

    private int paramA;
    private int paramB;

    public DevisionCalculate(int paramA, int paramB){
        this.paramA = paramA;
        this.paramB = paramB;
    }

    @Override
    int calculate() {
        return paramA / paramB;
    }
}
