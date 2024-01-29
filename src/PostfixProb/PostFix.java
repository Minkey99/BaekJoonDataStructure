package PostfixProb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PostFix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /* inputs */
        int N = Integer.parseInt(br.readLine());
        /* PostFix */
        String postFix = br.readLine();
        /* A-Z == 0-26 */
        Double[] value = new Double[N];
        for(int i = 0; i < N; i++) { value[i] = Double.parseDouble(br.readLine()); }

        Stack<Double> stack = new Stack<>();
        Double operand1, operand2;
        char operator;

        //PostFix.changeNum(postFix, value);

        /* Push input */
        for(int i = 0; i < postFix.length(); i++) {
            if( postFix.charAt(i) >= 'A' && postFix.charAt(i) <= 'Z' ) stack.push( value[postFix.charAt(i) - 'A'] );
            else {
                operand2 = stack.pop(); operand1 = stack.pop(); operator = postFix.charAt(i);
                /* operator 따른 연산 */
                switch (operator) {
                    case '+':
                        stack.push(operand1+operand2);
                        break;
                    case '-':
                        stack.push(operand1-operand2);
                        break;
                    case '*':
                        stack.push(operand1*operand2);
                        break;
                    case '/':
                        stack.push(operand1/operand2);
                        break;
                }
            }
        }
        /* 소수점 2째자리 출력. String 클래스 format 함수 이용 */
        String res = String.format("%.2f", stack.pop());
        System.out.println(res);
    }

    public static void changeNum( String change, int[] value ) {
        for( int i = 0; i < change.length(); i++ ) {

            switch ( change ) {
                case "A": change = change.replace('A', (char)value[i]); break;
                case "B": change = change.replace('B', (char)value[i]); break;
                case "C": change = change.replace('C', (char)value[i]); break;
                case "D": change = change.replace('D', (char)value[i]); break;
                case "E": change = change.replace('E', (char)value[i]); break;
                case "F": change = change.replace('F', (char)value[i]); break;
                case "G": change = change.replace('G', (char)value[i]); break;
                case "H": change = change.replace('H', (char)value[i]); break;
                case "I": change = change.replace('I', (char)value[i]); break;
                case "J": change = change.replace('J', (char)value[i]); break;
                case "K": change = change.replace('K', (char)value[i]); break;
                case "L": change = change.replace('L', (char)value[i]); break;
                case "M": change = change.replace('M', (char)value[i]); break;
                case "N": change = change.replace('N', (char)value[i]); break;
                case "O": change = change.replace('O', (char)value[i]); break;
                case "P": change = change.replace('P', (char)value[i]); break;
                case "Q": change = change.replace('Q', (char)value[i]); break;
                case "R": change = change.replace('R', (char)value[i]); break;
                case "S": change = change.replace('S', (char)value[i]); break;
                case "T": change = change.replace('T', (char)value[i]); break;
                case "U": change = change.replace('U', (char)value[i]); break;
                case "V": change = change.replace('V', (char)value[i]); break;
                case "W": change = change.replace('W', (char)value[i]); break;
                case "X": change = change.replace('X', (char)value[i]); break;
                case "Y": change = change.replace('Y', (char)value[i]); break;
                case "Z": change = change.replace('Z', (char)value[i]); break;
            }
        }
    }
}
