package PuthProb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Puth {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int N = Integer.parseInt(input.split(" ")[0]);
        int K = Integer.parseInt(input.split(" ")[1]);

        Deque<Integer> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        sb.append('<');

        /* 순차 init */
        for(int i = 0; i < N; i++) {
            deque.add( i+1 );
        }

        for(int i = 0; i < N-1; i++) {
            /* K-1번 돌리기 */
            for(int j = 0; j < K-1; j++) {
                deque.add(deque.remove());
            }
            /* 제거 */
            sb.append(deque.remove()).append(", ");
        }

        /* 출력 양식 맞추기위해 마지막 원소는 따로 append */
        sb.append(deque.poll());
        sb.append('>');

        System.out.print(sb);
    }
}
