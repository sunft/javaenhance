package cn.sunft.day02.generic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ·ºÐÍ×ÛºÏ°¸Àý
 * @author sunft
 *
 */
public class TraverseMap {

	public static void main(String[] args) {
		Map<String, Integer> maps = new HashMap<String, Integer>();
		maps.put("kakaluote", 28);
		maps.put("kulin", 35);
		maps.put("gui", 33);
		
		Set<Map.Entry<String, Integer>> entrySet = maps.entrySet();
		for(Map.Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() 
					+ " : " + entry.getValue());
		}
		
	}

}
