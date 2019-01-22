package main;

public class stack {
int[] arr=new int[5];
 int top=0;
public void push(int data ){
    arr[top]=data;
    top++;

}
public int pop(){
    int sof;
    top--;
    sof=arr[top];
    arr[top]= 0;
    return sof;
}
public int peek()
{
    int sof;
    sof=arr[top-1];
    return sof;
}
public void show(){
    for(int n:arr) {
   System.out.print(n+" ");
    }
}
}
