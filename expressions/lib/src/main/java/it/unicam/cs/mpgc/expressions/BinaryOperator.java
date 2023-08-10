package it.unicam.cs.mpgc.expressions;

public enum BinaryOperator {
    SUM,
    DIF,
    MUL,
    DIV;

    public <T> T apply(ExpressionEvaluator<T> evaluator, T v1, T v2) {
        return switch (this) {
            case SUM -> evaluator.sum(v1, v2);
            case DIF -> evaluator.dif(v1, v2);
            case MUL -> evaluator.mul(v1, v2);
            case DIV -> evaluator.div(v1, v2);
        };
    }
}
