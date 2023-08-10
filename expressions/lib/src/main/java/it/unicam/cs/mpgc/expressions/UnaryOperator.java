package it.unicam.cs.mpgc.expressions;

public enum UnaryOperator {
    PLUS,
    MINUS;

    public <T> T apply(ExpressionEvaluator<T> evaluator, T v) {
        return switch (this) {
            case PLUS -> evaluator.plus(v);
            case MINUS -> evaluator.minus(v);
        };
    }
}
