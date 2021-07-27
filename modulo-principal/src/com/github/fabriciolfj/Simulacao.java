package com.github.fabriciolfj;

import com.github.fabriciolfj.fabriciolfj.client.HttpClient;
import com.github.fabriciolfj.fabriciolfj.model.Person;

public class Simulacao {

    public static void main(String[] args) {
        var http = new HttpClient();
        http.execute(new Person("fabricio"));
    }
}
