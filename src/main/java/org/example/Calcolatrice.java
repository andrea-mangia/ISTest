package org.example;

public class Calcolatrice {
    private int a,b;

    public void Calcolatrice(){
        a = 0;
        b = 0;
    }

    public int sum(int a, int b){
        return a+b;
    }

    public int diff(int a, int b){
        return a - b;
    }

    public int mul(int a, int b){
        return a*b;
    }

    public int div(int a, int b){
        return a/b;
    }
}
