package main.java.strategy;

/**
 * @author Lichenyi
 * @date 2017/6/30 0030
 */
public class Context {

    private AbstractCalculation calculation;

    public Context(AbstractCalculation calculation){
        this.calculation = calculation;
    }

    public String getResult(){
        return this.calculation.calculate()+"";
    }
}
