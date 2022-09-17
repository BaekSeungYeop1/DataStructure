package Stack;

import java.util.Stack;

public class StackPractice {
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

// 데이터 삽입
        stack.push(1);
        stack.push(2);
        stack.push(3);

// 데이터 출력
        sum += stack.peek();
        System.out.println(sum);
        stack.peek(); // 3 출력 (맨 위의 값 출력)

// 데이터 삭제
        stack.pop(); // 3 제거
        stack.pop(); // 2 제거
        stack.pop(); // 1 제거
        stack.clear(); // 모든 데이터 제거
    }
}
