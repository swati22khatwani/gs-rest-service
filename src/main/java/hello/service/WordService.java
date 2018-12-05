package hello.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import hello.model.ResponseWrapper;

@Service
public class WordService {

	public ResponseWrapper checkForPalindromeAndAnalogOfIt(String word) {
		ResponseWrapper response = new ResponseWrapper();
		response.setWord(word);

		response.setPalindrome(checkIfPalindrome(word));
		response.setAnagramOfPalindrome(checkIfAnalogOfPalindrome(word));
		
		return response;
	}

	private boolean checkIfPalindrome(String word) {
		StringBuilder sb = new StringBuilder(word);
		String reverseWord = sb.reverse().toString();
		if(word.equalsIgnoreCase(reverseWord)){
			return true;
		}else{
			return false;
		}
	}

	private boolean checkIfAnalogOfPalindrome(String word) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if(map.containsKey(c)){
				int count = map.get(c);
				map.put(c, count+1);
			}else{
				map.put(c, 1);
			}
		}
		if(map != null && !map.isEmpty()){
			boolean hasAlreadyOdd = false;
			Collection<Integer> vals = map.values();
			for (Integer integer : vals) {
				if(hasAlreadyOdd && integer % 2 != 0){
					return false;
				}
				if(integer % 2 != 0){
					hasAlreadyOdd = true;
				}
			}
		}
		return true;
	}

}