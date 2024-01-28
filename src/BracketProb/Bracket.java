package BracketProb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        String VPS = "";

        for(int i = 0; i < T; i++) {
            /* input */
            VPS = br.readLine();
            for(int idx = 0; idx < VPS.length(); idx++) {
                if( VPS.charAt(idx) == '(' ) { stack.push( VPS.charAt(idx)); }
                else {
                    if( stack.empty() ) {
                        stack.push(VPS.charAt(idx));
                        break;
                    }
                    else {
                        stack.pop();
                    }
                }
            }

            /* output */
            if( stack.empty() ) { System.out.println("YES"); }
            else { System.out.println("NO"); }

            stack.clear();
        }
    }
}
