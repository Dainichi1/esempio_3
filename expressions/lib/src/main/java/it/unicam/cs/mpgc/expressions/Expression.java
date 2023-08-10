package it.unicam.cs.mpgc.expressions;

public interface Expression {

    <T> T eval(ExpressionEvaluator<T> evaluator);

    /*
    int evalToInteger();

    double evalToDouble();

    long evalToLong();
     */

    static void main(String[] argv) {
        Expression expr = new BinaryExpression(
                new BinaryExpression(
                        new NumericExpression(2),
                        BinaryOperator.MUL,
                        new NumericExpression(5)
                ),
                BinaryOperator.DIV,
                new BinaryExpression(
                        new NumericExpression(2),
                        BinaryOperator.SUM,
                        new NumericExpression(5)
                )
        );
        System.out.println(expr.eval(new IntegerExpressionEvaluator()));
        System.out.println(expr.eval(new LatexExpressionEvaluator()));
    }

}
