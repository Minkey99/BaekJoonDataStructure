package CardProb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class card2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();

        /* Init */
        for(int i = 0; i < N; i++) {
            deque.add( i+1 );
        }

        for(int i = 0; i < N-1; i++) {
            deque.remove();
            deque.offer(deque.poll());
        }

        System.out.print(deque.remove());
    }
}
