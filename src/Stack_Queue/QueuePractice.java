package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();

// 데이터 삽입
        q.offer(1);
        q.offer(2);
        q.offer(3);

// 데이터 출력& 삭제
        q.peek(); // 1 출력 (맨 위의 값 출력)
        q.poll(); // 1 출력 후 삭제

// 데이터 삭제
        q.remove(); // 2 삭제
        q.clear(); // 모든 데이터 삭제
    }
}
