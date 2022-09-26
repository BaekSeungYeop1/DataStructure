package Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class DequePractice {
    public static void main(String args[]){
        // Deque 생성
        Deque<String> deque1 = new ArrayDeque<>();
        Deque<String> deque2 = new LinkedBlockingDeque<>();
        Deque<String> deque3 = new ConcurrentLinkedDeque<>();
        Deque<Integer> deque = new LinkedList<>();

        // Deque 값 추가
        deque.addFirst(1); // Deque의 앞쪽에 데이터를 삽입, 용량 초과시 Exception
        deque.offerFirst(3); //  Deque의 앞쪽에 데이터를 삽입 후 true, 용량 초과시 false

        deque.addLast(5); // Deque의 뒤쪽에 데이터를 삽입, 용량 초과시 Exception
        deque.add(7); // addLast()와 동일
        deque.offerLast(9); //Deque의 뒤쪽에 데이터를 삽입 후 true, 용량 초과시 false
        deque.offer(11); // offerLast()와 동일

        deque.push(13); // addFirst()와 동일
        deque.pop(); // removeFirst()와 동일

        // Deque 값 제거
        deque.removeFirst(); // Deque의 앞에서 제거, 비어있으면 예외
        deque.remove(); // removeFirst()와 동일
        deque.poll(); // Deque의 앞에서 제거, 비어있으면 null 리턴
        deque.pollFirst(); // poll()과 동일

        deque.removeLast(); // Deque의 뒤에서 제거, 비어있으면 예외
        deque.pollLast(); // Deque의 뒤에서 제거, 비어있으면 null 리턴

        // Deque 값 확인
        deque.getFirst(); // 첫 번째 엘리먼트를 확인, 비어있으면 예외
        deque.peekFirst(); // 첫 번째 엘리먼트를 확인, 비어있으면 null 리턴
        deque.peek();// peekFirst()와 동일

        deque.getLast(); // 마지막 엘리먼트를 확인, 비어있으면 예외
        deque.peekLast();// 마지막 엘리먼트를 확인, 비어있으면 null 리턴

        //deque.contain(Object o); // Object 인자와 동일한 엘리먼트가 포함되어 있는지 확인
        deque.size(); // Deque에 들어있는 엘리먼트의 개수

        // Deque 순회
        // for 문을 이용한 순회
        for (String elem : deque1) {
            System.out.println(elem);
        }

// Iterator를 이용한 순회
        Iterator<String> iterator = deque1.iterator();
        while (iterator.hasNext()) {
            String elem = iterator.next();
            System.out.println(elem);
        }

// 역순순회
        Iterator<String> reverseIterator = deque1.descendingIterator();
        while (reverseIterator.hasNext()) {
            String elem = reverseIterator.next();
            System.out.println(elem);
        }
    }

}
