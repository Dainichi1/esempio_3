package it.unicam.cs.mpgc.expressions;

public class UnaryExpression implements Expression {

    private final UnaryOperator op;

    private final Expression argument;

    public UnaryExpression(UnaryOperator op, Expression argument) {
        this.op = op;
        this.argument = argument;
    }

    public UnaryOperator getOp() {
        return op;
    }

    public Expression getArgument() {
        return argument;
    }


    @Override
    public <T> T eval(ExpressionEvaluator<T> evaluator) {
        return op.apply(evaluator, this.argument.eval(evaluator));
    }
}
