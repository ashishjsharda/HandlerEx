package org.example;

import io.javalin.Javalin;

public class HandlerEx {
    public static void main(String[] args) {
        var app = Javalin.create(/*config*/)
                .get("/", ctx -> ctx.result("Hello World"))
                .start(7070);


        app.get("/input", ctx -> {
            // some code
            ctx.status(201);
            ctx.result("Created");
        });



    }
}

