package it.unicam.cs.mpgc.expressions;

public class BinaryExpression implements Expression {

    private final Expression firstArgument;

    private final BinaryOperator op;
    private final Expression secondArgument;

    public BinaryExpression(Expression firstArgument, BinaryOperator op, Expression secondArgument) {
        this.firstArgument = firstArgument;
        this.op = op;
        this.secondArgument = secondArgument;
    }

    public Expression getFirstArgument() {
        return firstArgument;
    }

    public BinaryOperator getOp() {
        return op;
    }

    public Expression getSecondArgument() {
        return secondArgument;
    }
    @Override
    public <T> T eval(ExpressionEvaluator<T> evaluator) {
        return op.apply(evaluator, firstArgument.eval(evaluator), secondArgument.eval(evaluator));
    }
}
