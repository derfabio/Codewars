package org.example.Codewars.sayHello;


public class SayHello {
    public String sayHello(String [] name, String city, String state){
        String fullName = String.join(" ", name);
        return "Hello, "+fullName+"! Welcome to "+city+", "+state+"!";
    }
}
