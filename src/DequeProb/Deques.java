package DequeProb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Deques {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer command;
        Deque<Integer> deque = new LinkedList<>();

        for(int i = 0; i < N; i++) {
            command = new StringTokenizer(br.readLine()," ");

                switch (command.nextToken()){
                    case "push_back":
                        deque.offerLast(Integer.parseInt(command.nextToken()));
                        break;
                    case "push_front":
                        deque.offerFirst(Integer.parseInt(command.nextToken()));
                        break;
                    case "pop_front":
                        if(deque.isEmpty()) System.out.println(-1);
                        else System.out.println(deque.pollFirst());
                        break;
                    case "pop_back":
                        if(deque.isEmpty()) System.out.println(-1);
                        else System.out.println(deque.pollLast());
                        break;
                    case "size":
                        System.out.println(deque.size());
                        break;
                    case "empty":
                        if(deque.isEmpty()) System.out.println(1);
                        else System.out.println(0);
                        break;
                    case "front":
                        if(deque.isEmpty()) System.out.println(-1);
                        else System.out.println(deque.peekFirst());
                        break;
                    case "back":
                        if(deque.isEmpty()) System.out.println(-1);
                        else System.out.println(deque.peekLast());
                        break;
                }
        }
    }
}
