package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class main {
    public static void main(String[] args) {


        stack js = new stack();
        js.push(10);
        js.push(20);
        System.out.println(js.peek());
        js.push(30);
       System.out.println(js.pop());
        js.show();

    }
}

