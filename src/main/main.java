package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class main {
    public static void main(String[] args) throws IOException {
        System.out.println("hello world");
        System.out.println("another line");
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter yor name");
        String name=bufferedReader.readLine();
        System.out.println(name);
        StringBuffer word= new StringBuffer(name);
        word.setCharAt(0,'m');
        System.out.println(word);


    }
}

