package Queue2Prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Queue2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        String back = "";

        for(int i = 0; i < N; i++) {
            String instruction = br.readLine();
            /* push */
            if( instruction.split(" ")[0].equals("push") ) {
                back = instruction.split(" ")[1];
                queue.offer( Integer.parseInt( back ));
            }
            if( instruction.equals("pop")) {
                if(queue.isEmpty()) System.out.println(-1);
                else System.out.println(queue.remove());
            }
            if( instruction.equals("front")) {
                if(queue.isEmpty()) { System.out.println(-1); }
                else System.out.println(queue.peek());
            }
            if( instruction.equals("back")) {
                if(queue.isEmpty()) { System.out.println(-1); }
                else System.out.println(back);
            }
            if( instruction.equals("empty")) {
                if(queue.isEmpty()) { System.out.println(1); }
                else { System.out.println(0); }
            }
            if( instruction.equals("size")) { System.out.println(queue.size()); }
        }
    }
}
