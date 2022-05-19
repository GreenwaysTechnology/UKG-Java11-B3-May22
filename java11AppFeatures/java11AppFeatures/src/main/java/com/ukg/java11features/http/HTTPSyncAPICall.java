package com.ukg.java11features.http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

class TodoService {
    HttpClient httpClient;
    HttpRequest request;

    TodoService() {
        httpClient = HttpClient.newBuilder().build();
    }

    //api to fetch all tdos
    public void fetchAllTodos() {
        var url = "https://jsonplaceholder.typicode.com/todos";
        request = HttpRequest
                .newBuilder().uri(URI.create(url)).build();

        try {
            //make request and get all todos
            var response = httpClient.send(request, HttpResponse.BodyHandlers.ofString()); //make http request sync
            //log response
            System.out.println(response.headers());
            System.out.println(response.body());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //async request
    public void fetchTodosAsync() {
        var url = "https://jsonplaceholder.typicode.com/todos";
        request = HttpRequest
                .newBuilder().uri(URI.create(url)).build();

        httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(response -> {
                    System.out.println("Http Client Thread : " + Thread.currentThread().getName());
                    return response.body();
                }).thenAccept(res -> {
                    System.out.println(res);
                })
                .join();
    }

}

public class HTTPSyncAPICall {
    public static void main(String[] args) {
        var todoService = new TodoService();
        //todoService.fetchAllTodos();
        todoService.fetchTodosAsync();
    }
}
