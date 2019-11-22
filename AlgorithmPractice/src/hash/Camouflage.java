package hash;

import java.util.HashMap;
import java.util.Iterator;

//https://programmers.co.kr/learn/courses/30/lessons/42578
public class Camouflage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(solution(clothes));
	}

	public static int solution(String[][] clothes) {
		int answer = 1;
		HashMap<String, Integer> cmap = new HashMap<String, Integer>();
		
		for(String[] s : clothes) {
			cmap.put(s[1],cmap.getOrDefault(s[1], 0)+1);
		}
		
		Iterator<Integer> iterator = cmap.values().iterator();
		while(iterator.hasNext()) {
			answer *= iterator.next().intValue()+1;
		}
		return answer-1;
	}

}
