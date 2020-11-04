package edu.arep.app;
import static spark.Spark.*;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        staticFiles.location("/public");
        get("numbers" ,(request, response) -> {
            
           return "numeros";
        });
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}