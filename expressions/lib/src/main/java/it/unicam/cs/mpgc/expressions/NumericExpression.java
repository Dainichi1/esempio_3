package it.unicam.cs.mpgc.expressions;

public class NumericExpression implements Expression {

    private final int value;


    public NumericExpression(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


    @Override
    public <T> T eval(ExpressionEvaluator<T> evaluator) {
        return evaluator.valueOf(this);
    }
}
