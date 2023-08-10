package it.unicam.cs.mpgc.expressions;

public class LatexExpressionEvaluator implements ExpressionEvaluator<String> {
    @Override
    public String sum(String v1, String v2) {
        return v1+"+"+v2;
    }

    @Override
    public String dif(String v1, String v2) {
        return v1+"-"+v2;
    }

    @Override
    public String div(String v1, String v2) {
        return String.format("\\frac{%s}{%s}",v1, v2);
    }

    @Override
    public String mul(String v1, String v2) {
        return v1+"*"+v2;
    }

    @Override
    public String valueOf(NumericExpression expr) {
        return expr.getValue()+"";
    }

    @Override
    public String plus(String v) {
        return "+"+v;
    }

    @Override
    public String minus(String v) {
        return "-"+v;
    }
}
