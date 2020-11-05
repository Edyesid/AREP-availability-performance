package edu.arep.app;
import edu.arep.app.model.Fibonacci;

import java.math.BigInteger;

import static spark.Spark.*;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        staticFiles.location("/public");
        port(getPort());
        get("/hello/:name", (request, response) -> {
            int n = Integer.parseInt(request.params(":name"));
            Fibonacci fib = new Fibonacci();
            BigInteger ans = fib.Calculate(n);
            return ans;
        });
    }
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 8080;
    }
}