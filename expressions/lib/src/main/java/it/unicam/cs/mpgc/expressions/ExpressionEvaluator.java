package it.unicam.cs.mpgc.expressions;

public interface ExpressionEvaluator<T> {

    T sum(T v1, T v2);

    T dif(T v1, T v2);

    T div(T v1, T v2);

    T mul(T v1, T v2);

    T valueOf(NumericExpression expr);
    // Il metodo valueOf(NumericExpression expr) è un po' diverso dagli altri metodi
    // in ExpressionEvaluator perché piuttosto che eseguire una specifica
    // operazione aritmetica, converte una NumericExpression in un valore del
    // tipo generico T.
    //
    //Ecco come funziona:
    //
    //La classe NumericExpression rappresenta un'espressione che contiene
    // un singolo valore numerico (in questo caso, un int).
    // Quando si valuta questa espressione usando un ExpressionEvaluator,
    // è necessario ottenere il valore contenuto nell'espressione e convertirlo
    // nel tipo di dato appropriato per l'evaluator in uso.
    //
    //Il metodo valueOf fa proprio questo: prende una NumericExpression come
    // argomento e restituisce il suo valore convertito nel tipo
    //�
    //T.

    T plus(T v);

    T minus(T v);
}
