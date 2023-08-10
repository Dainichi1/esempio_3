package it.unicam.cs.mpgc.expressions;

public class IntegerExpressionEvaluator implements ExpressionEvaluator<Integer> {


    @Override
    public Integer sum(Integer v1, Integer v2) {
        return v1+v2;
    }

    @Override
    public Integer dif(Integer v1, Integer v2) {
        return v1-v2;
    }

    @Override
    public Integer div(Integer v1, Integer v2) {
        return v1/v2;
    }

    @Override
    public Integer mul(Integer v1, Integer v2) {
        return v1*v2;
    }

    @Override
    public Integer valueOf(NumericExpression expr) {
        return expr.getValue();
    }

    @Override
    public Integer plus(Integer v) {
        return v;
    }

    @Override
    public Integer minus(Integer v) {
        return -v;
    }
}
