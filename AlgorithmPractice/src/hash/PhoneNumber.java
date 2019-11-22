package hash;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/42577
public class PhoneNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] phone_book = {"119", "9764223", "1195524421"};
		System.out.println(solution(phone_book));
	}
	
	public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        
        for(int i=0;i<phone_book.length-1;i++) {
        	if(phone_book[i+1].startsWith(phone_book[i])) {
        		answer = false;
        		break;
        	}
        }
        return answer;
    }
}
