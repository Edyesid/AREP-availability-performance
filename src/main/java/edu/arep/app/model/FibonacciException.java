package edu.arep.app.model;

public class FibonacciException extends Exception {
    public static final String MIN_NUM = "El numero debe ser mayor que cero";
    public FibonacciException() {
        super();
    }
    public FibonacciException(String message) {
        super(message);
    }
}
