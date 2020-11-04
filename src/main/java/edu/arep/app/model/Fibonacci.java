package edu.arep.app.model;
import java.math.BigInteger;
public class Fibonacci {
    BigInteger nth_1 = BigInteger.ONE;
    BigInteger nth_2 = BigInteger.ZERO;
    BigInteger answer = BigInteger.ZERO;
    public Fibonacci() {
    }
    public BigInteger Calculate(int nth) throws FibonacciException {
        if (nth < 0) {
            throw new FibonacciException(FibonacciException.MIN_NUM);
        }
        else if(nth == 0) {
            answer = nth_2;
        }
        else if(nth == 1) {
            answer = nth_1;
        }
        else {
            for (int i = 0; i < nth - 1; i++) {
                answer = nth_2.add(nth_1);
                nth_2 = nth_1;
                nth_1 = answer;
            }
        }
        return answer;
    }
}