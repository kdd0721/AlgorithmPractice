package stack_queue;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/42587
public class Printer {

	public static void main(String[] args) {

		int[] priorities = {2,1,3,2};
		int location = 2;
		int answer = solution(priorities, location);
		
		System.out.println(answer);
	}
	
	public static int solution(int[] priorities, int location) {
        int answer = 0;
        int num = priorities[location];
        System.out.println(num);
        return answer;
    }
	
}
