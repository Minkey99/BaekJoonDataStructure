package StackProb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stacks {
    int size;
    int top;

    public Stacks(int size, int top) {
        this.size = size;
        this.top = top;
    }

    private void push( int[] arr, int atom ) {
        arr[++top] = atom;
    }

    private int pop( int[] arr ) {
        if( top == -1 ) return -1;
        return arr[top--];
    }
    private int top( int[] arr ) {
        if( top == -1 ) return -1;
        return arr[top];
    }

    private int size() {
        return top+1;
    }

    private int empty() {
        if(top == -1) return 1;
        else return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /* input */
        int N = Integer.parseInt(br.readLine());
        String s = "";
        //int N = br.read();
        //String[] instruction = new String[]{br.readLine()};
        //String[] instruction = {"push 1", "push 2", "top", "size", "empty" ,"pop" ,"pop" ,"pop" ,"size", "empty", "pop", "push 3", "empty", "top"};

        /* Stack */
        Stacks stacks = new Stacks(N, -1);
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            /* push X */
            s = br.readLine();
            if( s.length() >= 6 ) { stacks.push( arr , Integer.parseInt(s.split(" ")[1] )); }
            if( s.equals("top") ) { System.out.println(stacks.top(arr)); }
            if( s.equals("pop") ) { System.out.println(stacks.pop(arr)); }
            if( s.equals("size") ) { System.out.println(stacks.size()); }
            if( s.equals("empty") ) { System.out.println(stacks.empty()); }
        }
    }
}
