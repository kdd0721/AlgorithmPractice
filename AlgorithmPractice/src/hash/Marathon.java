package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://programmers.co.kr/learn/courses/30/lessons/42576
public class Marathon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant= {"leo", "kiki", "eden", "ooo"};
		String[] completion= {"kiki", "eden", "leo"};
		System.out.println(solution(participant, completion));
	}
	
	public static String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i=0; i<completion.length; i++) {
			if(! participant[i].equals(completion[i])) return participant[i];
		}
		
		return participant[participant.length-1];
    }

}
