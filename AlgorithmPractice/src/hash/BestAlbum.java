package hash;

import java.util.HashMap;
import java.util.Iterator;

//https://programmers.co.kr/learn/courses/30/lessons/42579
public class BestAlbum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		System.out.println(solution(genres, plays));

	}
	
	public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0;i<genres.length;i++) {
        	map.put(genres[i], map.getOrDefault(genres[i], plays[i])+plays[i]);
        }
        System.out.println(map);
        return answer;
	}
}
