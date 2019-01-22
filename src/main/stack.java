package main;

public class stack {
int[] arr=new int[5];
 int top=0;
public void push(int data ){
    if (size() == arr.length)
        System.out.println("cant push as the array is full");
  else {
        arr[top] = data;
        top++;
    }
}
public int pop() {

    int sof=0;
    if (isempty())
        System.out.println("cant pop as the stack is empty");

    else {

        top--;
        sof = arr[top];
        arr[top] = 0;

    }
    return sof;
}
public int peek()
{
    int sof;
    sof=arr[top-1];
    return sof;
}
public int size(){
    return top;
}
public boolean isempty(){
      return (top<=0);
}

public void show(){
    for(int n:arr) {
   System.out.print(n+" ");
    }
}
}
